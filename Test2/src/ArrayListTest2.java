import java.util.ArrayList;
import java.util.List;

/**
 * static method nathuwa Normal Method sadaha pamani
 */


public class ArrayListTest2 {
	
	// updateArray --> normal method
	public void updateArray(int a) {
		
		System.out.println("Updated no is : " +  (a+5));
	}

	public static void main(String[] args) {

		ArrayListTest2 arrayListTest2 = new ArrayListTest2();
		
		List<Integer> list = new ArrayList<>();
		
		list.add(12);
		list.add(13);
		list.add(14);
		
		
		
		// :: right side --> method
		// :: left side --> object/class name
		// method reference
		list.forEach(arrayListTest2::updateArray);
	}

}
