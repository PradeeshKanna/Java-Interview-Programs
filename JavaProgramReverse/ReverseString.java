package JavaProgramReverse;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Pradeesh";
		String revStr = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			revStr = revStr + str.charAt(i);
		}

		System.out.println("Revered String: " + revStr);

		// 2. Reverse using String Buffer
		String input = "abcd";
		StringBuffer sb = new StringBuffer(input);
		System.out.println(sb.reverse()); 			// Output: dcba

		// 3. Reverse using String Builder
		String input1 = "abcd";
		StringBuilder sb1 = new StringBuilder(input1);
		System.out.println(sb1.reverse()); 			// Output: dcba
	}
}
