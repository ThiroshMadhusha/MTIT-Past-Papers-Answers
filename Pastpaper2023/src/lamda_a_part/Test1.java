package lamda_a_part;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface IMarksService1{
	public String checkMarks(List<Double> listOfMarks);
}

public class Test1 {
	
	public static void main(String[] args) {
		
		
		IMarksService1 iMarksService1 = (listOfMarks)->{
			
			double total = 0;
			for (Double marks: listOfMarks) {
				total = total + marks;
			}
			
			double averageMark = total/listOfMarks.size();
			if((averageMark <=100.0) && (averageMark > 79.0)) {
				return "A";
			}else if((averageMark <=80.0) && (averageMark > 59.0)) {
				return "B";
			}
			else if((averageMark <=60.0) && (averageMark > 44.0)) {
				return "C";
			}else if((averageMark <=45.0) && (averageMark > 0.0)) {
				return "F";
			}else {
				return "Incorrect";
			}
			
		};
		ArrayList<Double> markList = new ArrayList<>();
		
		markList.add(100.0);
		markList.add(80.0);
		markList.add(75.0);
		markList.add(65.0);
		markList.add(40.0);
		markList.add(0.0);
		
		System.out.println("Student average marks is = " + iMarksService1.checkMarks(markList));
	}

}
