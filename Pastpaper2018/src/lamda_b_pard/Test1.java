package lamda_b_pard;

public class Test1 {
	
	public static void main(String[] args) {
		
		Runnable r2 = new Runnable() {
			
			@Override
			public void run() {
				for(int x = 0; x < 10; x++) {
					for(int y = 0; y < 10; y++) {
						System.out.println(y);
					}
					System.out.println();
				}
			}
			
		};
		new Thread(r2).start();
	}

}
