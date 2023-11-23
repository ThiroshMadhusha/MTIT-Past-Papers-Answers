package Lamda_c_part;

import java.util.ArrayList;
import java.util.List;

interface IReference {
	void displayFruits();
}
public class Code2018Method {
	
	public void displayFruits() {
		List<String> fruites = new ArrayList<String>();
		
		fruites.add("Apple");
		fruites.add("Orange");
		fruites.add("Pine-Apple");
		fruites.add("Banana");
		fruites.add("Mango");
		fruites.forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		
		Code2018Method first = new Code2018Method();
		
		IReference iReference = first::displayFruits;
		iReference.displayFruits();
	}

}
