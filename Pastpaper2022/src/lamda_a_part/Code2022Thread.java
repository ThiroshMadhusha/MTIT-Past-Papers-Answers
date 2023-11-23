package lamda_a_part;

import java.util.ArrayList;

public class Code2022Thread implements Runnable {
	
	ArrayList<Integer> list;
	
	public Code2022Thread(ArrayList<Integer> list) {
		this.list = list;
	}
	
	@Override
	public void run() {
		
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
	}
	

}
