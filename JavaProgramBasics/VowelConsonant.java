package JavaProgramBasics;

public class VowelConsonant {
	public static void main(String[] args) {
 
		char c = 'i';
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			System.out.println(c + " is vowel");
		} else {
			System.out.println(c + " is consonant");
		}
	}
}

//		// 2nd Method using Switch Operator
//
//		char c = 'p';
//		
//		switch(c) {
//		case 'a':
//		case 'e':
//		case 'i':
//		case 'o':
//		case 'u':
//			System.out.println(c +" is vowel");
//			break;
//		default:
//			System.out.println(c + " is consonant");