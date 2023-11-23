

/**
 * Runnable is a FunctionalInterface
 */
public class ThreadClassTheory1 {
	
	public static void main(String[] args) {
		
		Runnable consumer = () -> {};
		
		Runnable producer = () -> {};
		
		Thread tread1 = new Thread(consumer);
		Thread tread2 = new Thread(producer);
		
		tread1.run();
		tread2.run();
	}

}
