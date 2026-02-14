package JavaProgramBasics;

//Java Program to Check Whether a Number is Prime or Not
public class PrimeNumberCheck {

	public static void main(String[] args) {
		int num = 7;
		boolean isPrime = true;

		//------- Method 1
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) 
			System.out.println(num + " is prime");
		else 
			System.out.println(num + " is not prime");

		// ------- Method 2
		int count = 0;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2)
			System.out.println("Prime");
		else
			System.out.println("Not a Prime");
	}

}
