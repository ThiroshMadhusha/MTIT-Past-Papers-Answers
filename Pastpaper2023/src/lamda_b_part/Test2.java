package lamda_b_part;

public class Test2 {

	public static void main(String[] args) {


		Runnable thread = new Runnable() {
			
			public void run() {
				
				for(int row = 0; row < 6; row++) {
					for(int column = 0; column < row; column++) {
						System.out.println(column);
					}
					System.out.println();
				}
			}
		};
		new Thread(thread).start();
	}

}
