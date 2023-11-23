package lamda_b_part;

import java.util.stream.IntStream;

public class Code2023Lambda {
	
	public static void main(String[] args) {
		
		Runnable thread = () -> {
			
			IntStream.iterate(0,  row -> row + 1).limit(6).forEach(row ->{
				IntStream.iterate(0,column -> column + 1).limit(row).forEach(column ->{
					System.out.println(column);
				});
				System.out.println();
			});
		};
		new Thread(thread).start();
	}
}
	
	
		
