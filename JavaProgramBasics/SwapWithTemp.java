package JavaProgramBasics;

public class SwapWithTemp {

	public static void main(String[] args) {
		int a = 120;
		int b = 50;
		int temp;

		temp = a;
		a = b;
		b = temp;

		System.out.println("A Value after swap :" + a);
		System.out.println("B Value after swap :" + b);
	}
}
