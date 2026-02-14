package JavaProgramBasics;

//Java Program to Find the Frequency of Character in a String
public class FrequencyCharacter {
	
	public static void main(String[] args) {
		String input="Apple Pineapple";
		char ch='p';
		int count=0;
		
		for(int i=0; i<input.length();i++) {
			if(ch == input.charAt(i)) {
				count++;
			}
		}
		
		System.out.println(ch +" character total frequency : "+count);
	}
}

// Output: 4
