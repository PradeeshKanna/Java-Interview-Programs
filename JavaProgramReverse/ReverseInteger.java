package JavaProgramReverse;

public class ReverseInteger {

	public static void main(String[] args) {
		int num = 12345;
		int rem, sum = 0;
		
		while (num > 0) {
			rem = num % 10;
			sum = (sum * 10) + rem;
			num = num / 10;
		}
		System.out.println("Reversed Integer: " + sum);
	}
}
