package Lamda_c_part;

import java.util.ArrayList;
import java.util.List;

interface IReferences {
    void displayFruits();
}

public class Answer2018Method {

	public void displayFruits() {
        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Pine-Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.forEach(System.out::println);
    }

    public static void main(String[] args) {
        Code2018Method first = new Code2018Method();

        IReferences iReference = first::displayFruits;
        iReference.displayFruits();
    }
    
}
