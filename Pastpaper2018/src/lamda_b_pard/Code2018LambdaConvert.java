package lamda_b_pard;

import java.util.stream.IntStream;

public class Code2018LambdaConvert {
	
	public static void main(String[] args) {
		
		Runnable r2 = ()->{
			
			IntStream.iterate(0,  x->x +1).limit(10).forEach(x->{
				IntStream.iterate(0,  y-> y+1).limit(10).forEach(y->{
					System.out.println(y);
				});
				System.out.println();
			});
			
		};
		new Thread(r2).start();
	}

}
