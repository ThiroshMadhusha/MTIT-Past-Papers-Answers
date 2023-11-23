import java.util.ArrayList;
import java.util.List;

public class PastPaper2022 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		Runnable producer = () -> {
			synchronized (list) {
				int value = 0;
				while(true) {
					System.out.println("Producer Started");
					
					try {
						value += 10;
						list.add(value);
						System.out.println("Producer adding value = " + value + " to Queue");
						
						list.wait();
						Thread.sleep(1000);
						
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
					
					list.notify();
					System.out.println("Element in Queue = " + list);
				}
			}
		};
		
		Runnable consumer = () -> {
			
			synchronized (list) {
				
				while(true) {
					System.out.println("Consumer Started");
					
					try {
						System.out.println("Consumer thread consume " + list.get(0));
						list.remove(0);
						list.notify();
						Thread.sleep(1000);
						list.wait();
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
					
					
					System.out.println("Element in Queue = " + list);
				}
			}
		};
		
		producer.run();
		consumer.run();
	}

}

