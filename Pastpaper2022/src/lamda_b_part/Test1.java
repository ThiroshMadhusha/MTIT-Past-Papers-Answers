package lamda_b_part;

import java.util.Arrays;


public class Test1 {
	
	public static void main(String[] args) {
		
		String[] stringArray = {"sSS", "rRR", "aaa", "UUU", "jjj", "PpP", "yyy"};
		
		Arrays.sort(stringArray, String::compareToIgnoreCase);
		
		for (String value : stringArray) {
			System.out.println(value);
		}
	}

}
