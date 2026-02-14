package JavaProgramBasics;

//Java Program to Display Alphabets (A to Z) using loop
public class PrintAlphabet {
	public static void main(String[] args) {
		char ch;
		
		// Printing all alphabets in Upper case
		for(ch='A'; ch<='Z'; ch++) {
			System.out.print(ch + " ");
		}
		
		// Printing all alphabets in Lower case
		for(ch='a'; ch<='z'; ch++) {
			System.out.print(ch + " ");
		}
	}
}
