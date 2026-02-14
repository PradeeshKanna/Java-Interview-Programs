package JavaProgramBasics;

public class ConvertCharArrayToString {
	
	public static void main(String[] args) {
		
		char charArray [] = {'H','E','L','L','O'};
		
		String str1 = new String(charArray);
		System.out.println(str1);				// Output: HELLO
		
		String str2= String.valueOf(charArray);
		System.out.println(str2);				// Output: HELLO
		
		// 2. Converting Character to String
		char ch='a';
		
		String s1= Character.toString(ch);
		System.out.println(s1);					// Output: a
		
		String s2= String.valueOf(ch);
		System.out.println(s2);					// Output: a
		
	}

}
