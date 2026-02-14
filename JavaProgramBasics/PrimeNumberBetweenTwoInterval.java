package JavaProgramBasics;

import java.util.Scanner;

//Java Program to Check Prime Numbers Between Two Intervals
public class PrimeNumberBetweenTwoInterval {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter start number: ");
		int start= scanner.nextInt();
		
		System.out.println("Enter end number: ");
		int end= scanner.nextInt();
		
		for(int i=start; i<=end; i++) {
			boolean isPrime=true;
			
			for(int j=2; j<=i/2;j++) {
				if(i%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				System.out.print(i+" ");
			}
		}
	}
}

// Output: 1 2 3 5 7 