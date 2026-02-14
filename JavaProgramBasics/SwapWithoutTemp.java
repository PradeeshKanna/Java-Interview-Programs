package JavaProgramBasics;

public class SwapWithoutTemp {

	public static void main(String[] args) {
		int a = 120;
		int b = 50;

		a = a - b;
		b = a + b;
		a = b - a;

		System.out.println("A Value after swap :" + a);
		System.out.println("B Value after swap :" + b);
	}
}
