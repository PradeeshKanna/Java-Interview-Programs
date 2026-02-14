package JavaProgramBasics;

import java.util.Scanner;

public class ReadInputFromUser {
	
	public static void main(String[] args) {
		
		// Read Integer
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter a number :");
		int input = s1.nextInt();
		
		System.out.println("Your number is :"+input);
		
		// Read String
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter any word :");
		String word = s2.next();
		
		System.out.println("Your word is :"+word);
	}

}
