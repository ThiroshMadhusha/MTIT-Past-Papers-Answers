
/**
 * Create interface
 */

interface ICalculator {
	
//	create methods
	void calculation(int a, int b);
}

// create common class

class Calculate{
	public int sum(int a, int b) {
		return a+ b;
	}
	public int sub(int a, int b) {
		return a - b;
	}
}

public class ArrayListJava {

	public static void main(String[] args) {

		ICalculator iCalculator = new ICalculator() {
			
			@Override
			
			public void calculation(int a, int b) {
//				
				System.out.println("sum is " + (a + b));
			}
		};
		iCalculator.calculation(50, 100);
		
//		Calculate calculate = new Calculate();
//		System.out.println(calculate.sum(4, 80));
	}

}
