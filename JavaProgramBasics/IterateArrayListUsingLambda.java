package JavaProgramBasics;

import java.util.ArrayList;

//Java Program to Iterate an ArrayList using Lambda Expression
public class IterateArrayListUsingLambda {
	
	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Banana");
		
		fruits.forEach((e) -> {
			System.out.println(e);
		});

	}

}
