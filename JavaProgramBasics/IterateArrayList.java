package JavaProgramBasics;

import java.util.ArrayList;
import java.util.Iterator;

// Java Program to Iterate an ArrayList
public class IterateArrayList {
	public static void main(String[] args) {
		
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Banana");
		
		// Print in Array format
		System.out.println(fruits); // Output: [Mango, Apple, Banana]
		
		// Print using For Loop
		for( int i=0;i<fruits.size(); i++) {
			System.out.println(fruits.get(i));
		}
		// Print using Enhanced-for Loop
		for(String fruit :fruits) {
			System.out.println(fruit);
		}
		
		// Print using Iterator
		Iterator<String> iterate = fruits.iterator();
		while(iterate.hasNext()) {
			System.out.println(iterate.next());
		}
	}
}
