import java.util.List;

interface IDisplay{
	void display();
}


public class MethodReference {

	
	public static void main(String[] args) {
		
		List<Integer> list = new ArryList<>();
		
		list.add(20);
		list.add(30);
		
		list.forEach((number)->System.out.println(number) ;
		
	}

}
