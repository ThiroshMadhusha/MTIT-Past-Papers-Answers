package lamda_b_part;

import java.util.Arrays;
import java.util.Comparator;

public class Code2022Method {
	
	public static void main(String[] args) {
		
		String[] stringArray = {"sSS", "rRR", "aaa", "UUU", "jjj", "PpP", "yyy"};
		
		Arrays.sort(stringArray, new Comparator<String>() {
			
			@Override
			public int compare(String value1, String value2) {
				return value1.compareToIgnoreCase(value2);
			}
		});
		
		for (String value : stringArray) {
			System.out.println(value);
		}
		
	}
}


