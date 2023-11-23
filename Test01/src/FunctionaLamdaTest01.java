

interface ICalculator1 {
	
//	create methods
	void calculation(int a, int b);
}
public class FunctionaLamdaTest01 {
	
	public static void main(String[] args) {

		ICalculator1 iCalculator = new ICalculator1() {
			
			@Override
			
			public void calculation(int a, int b) {
//				
				System.out.println("sum is " + (a + b));
			}
		};
		iCalculator.calculation(50, 100);
		
	}

}

