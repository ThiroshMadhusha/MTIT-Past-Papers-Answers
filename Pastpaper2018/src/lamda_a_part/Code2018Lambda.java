package lamda_a_part;

import java.util.ArrayList;
import java.util.List;

/**
 * 2018 Past Papers
 * Question Q1
 * Part A
 * Lambda Expression
 * Source Code
 */
@FunctionalInterface
interface IGradeService{
	public String checkGrade(List<Integer> listOfMarks);
}


public class Code2018Lambda implements IGradeService{
	
	@Override
	public String checkGrade(List<Integer> listOfMarks) {
		
		int total = 0; 
		for (Integer mark : listOfMarks) { 
			
			total = total + mark; 
		} 
		double average = total/listOfMarks.size(); 
		if(average >= 80.0){ 
			return "Best"; 
		}else if((average < 80.0) && (average >= 60.0)){ 
			return "Merit"; 
		}else if((average < 60.0) && (average >= 45.0)){ 
			return "Pass"; 
		}else{ 
			return "Fail"; 
		} 
	}
	public static void main(String[] args) {
		
		Code2018Lambda grade = new Code2018Lambda();
		
		ArrayList<Integer> listOfMarks = new ArrayList<Integer>(); 
		listOfMarks.add(85); 
		listOfMarks.add(75); 
		listOfMarks.add(60); 
		listOfMarks.add(80); 
		listOfMarks.add(100); 
		
		String result = grade.checkGrade(listOfMarks);
		System.out.println("Results is = " + result );
	}	

}
