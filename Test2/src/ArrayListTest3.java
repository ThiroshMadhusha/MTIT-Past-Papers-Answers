import java.util.ArrayList;
import java.util.List;

/**
 * static Method sadaha pamani
 */


public class ArrayListTest3 {
	
	// updateArray --> normal static method
	public static void updateArray(int a) {
		
		System.out.println("Updated no is : " +  (a+5));
	}

	public static void main(String[] args) {

//		ArrayListTest3 arrayListTest2 = new ArrayListTest3();
		
		List<Integer> list = new ArrayList<>();
		
		list.add(12);
		list.add(13);
		list.add(14);
		
		
		
		// :: right side --> method
		// :: left side --> object/class name
		// method reference
		list.forEach(ArrayListTest3::updateArray);
	}

}
