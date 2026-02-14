package JavaProgramBasics;

public class PalindromeInteger {
	
	public static void main(String[] args) {
		int input = 121;
		int output=0;
		int reminder=0, temp;
		 
		temp=input;
		
		while(input>0) {
			reminder=input%10;
			output=(output*10)+reminder;
			input=input/10;
		}

		if (output == temp) {
			System.out.println("Integer is palindrome");
		} else {
			System.out.println("Integer is not palindrome");
		}
	}

}
