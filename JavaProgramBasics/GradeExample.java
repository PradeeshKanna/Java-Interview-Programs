package JavaProgramBasics;

import java.util.Scanner;

//Java Program to Calculate Student Grades
public class GradeExample {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your score (0-100): ");
		int score = scanner.nextInt();

		System.out.println(score / 10);

		switch (score / 10) {
		case 10:
			System.out.println("Grade A+ Top");
			break;
		case 9:
			System.out.println("Grade A");
			break;
		case 8:
			System.out.println("Grade B");
			break;
		case 7:
			System.out.println("Grade C");
			break;
		case 6:
			System.out.println("Grade D");
			break;

		default:
			System.out.println("Grade F");
			break;
		}

	}
}
