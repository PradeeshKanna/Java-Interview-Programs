package JavaProgramReverse;

public class ReverseStringArray {

	public static void main(String[] args) {

		String str[] = { "Hi", "Hello", "How", "Are", "You" };
		String revStr[] = new String[str.length];
		
		// Index for reversed array
		int index = 0;

		for (int i = str.length - 1; i >= 0; i--) {
			revStr[index] = str[i];				// Store reversed value in revStr
			index++;							// Move to the next position in revStr
		}

		// Print the reversed array
		for (String s : revStr) {
			System.out.print(s + " "); 			// Output: You Are How Hello Hi
		}
	}
}
