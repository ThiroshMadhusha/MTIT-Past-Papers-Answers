import java.util.ArrayList;
import java.util.List;


/**
 * @FunctionalInterface daana eka anniwaarya wee
 */

@FunctionalInterface
interface IGradeService{
	public String checkGrade(List<Integer> listOfMarks);
}

public class PastPaper2018 {
	
	public static void main(String[] args) {
		
		/**
		 * lambda Expressions create
		 */
		IGradeService gradeService = (listOfMarks)->{
			
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
			
		};
		
		ArrayList<Integer> listOfMarks = new ArrayList<Integer>(); 
		listOfMarks.add(85); 
		listOfMarks.add(75); 
		listOfMarks.add(60); 
		listOfMarks.add(80); 
		listOfMarks.add(100); 
		
		System.out.println(gradeService.checkGrade(listOfMarks));
		
	}
}
