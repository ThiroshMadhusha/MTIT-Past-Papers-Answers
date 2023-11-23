import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		
		list.add(12);
		list.add(13);
		list.add(14);
		
		// list print
		list.forEach((numbers)->{System.out.println(numbers);});
		
		// method reference
		list.forEach(System.out::println);
	}

}
