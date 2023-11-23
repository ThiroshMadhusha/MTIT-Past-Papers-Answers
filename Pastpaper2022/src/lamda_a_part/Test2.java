package lamda_a_part;

import java.util.ArrayList;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		Thread t1 = new Thread(()->{
			
			synchronized (list) {
				
				int value = 0;
				while (true) {
					System.out.println("Producer started");
					
					try {
						value +=10;
						list.add(value);
						System.out.println("Producer adding value = " + value + " to Queue");
						list.wait();
						Thread.sleep(1000);;
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
					
					list.notify();
					System.out.println("Element in Queue = " + list);
				}
			}
		});
		
		Thread t2 = new Thread(()->{
			
			synchronized (list) {
				
				int value = 0;
				while (true) {
					System.out.println("Producer started");
					
					try {
						System.out.println("Consumer thread consume " + list.get(0));
						list.remove(0);
						list.notify();
						Thread.sleep(1000);
						list.wait();
						Thread.sleep(1000);;
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
					
					list.notify();
					System.out.println("Element in Queue = " + list);
				}
			}
		});
		
		t1.start();
		t2.start();

	}

}
