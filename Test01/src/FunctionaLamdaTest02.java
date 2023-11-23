

interface ICalculator2 {
	
//	create methods
	void calculation(int a, int b);
}
public class FunctionaLamdaTest02 {
	
	public static void main(String[] args) {

		ICalculator2 iCalculator = (a,b) -> { System.out.println("sum is " + (a + b));};

		iCalculator.calculation(50, 100);
		
		ICalculator2 calculator = (a,b) -> {System.out.println("sum is " + (a - b));};
		
		calculator.calculation(100, 20);
		
		ICalculator2 calculator2 = (a,b) -> {System.out.println("sum is " + (a + b));};
		
		calculator2.calculation(100, 200);
		

	}

}

