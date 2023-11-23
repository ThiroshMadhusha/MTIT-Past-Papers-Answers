package lamda_a_part;

import java.util.ArrayList;
import java.util.List;

public class Answer2022Thread {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		Thread producer = new Thread(()->{
			
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
		
		Thread consumer = new Thread(()->{
			
			synchronized (list) {
				
				int value = 0;
				while (true) {
					System.out.println("Consumer started");
					
					try {
						System.out.println("Consumer thread consume " + list.get(0));
						list.remove(0);
						list.notify();
						Thread.sleep(1000);
						list.wait();
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
					
					list.notify();
					System.out.println("Element in Queue = " + list);
				}
			}
		});
		producer.start();
		consumer.start();
	}

}
