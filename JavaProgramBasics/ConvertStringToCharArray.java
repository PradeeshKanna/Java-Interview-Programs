package JavaProgramBasics;

public class ConvertStringToCharArray {
	public static void main(String[] args) {
		String str = "Hello, World!";

		// Using charAt
		char[] charArray1 = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			charArray1[i] = str.charAt(i);
		}
		System.out.println(charArray1);

		// Using toCharArray
		char[] charArray2 = str.toCharArray();
		System.out.println(charArray2);
	}
}
