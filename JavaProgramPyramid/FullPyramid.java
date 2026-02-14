package JavaProgramPyramid;

public class FullPyramid {

	public static void main(String[] args) {

		int n = 5;

		for (int i = 1; i <= n; i++) {

			// Step 1: print spaces (i.e... 4,3,2,1,0 spaces)
			for (int space = 1; space <= n - i; space++) {
				System.out.print(" ");
			}

			// Step 2: print stars (i.e... 1,3,5,7,9 stars)
			for (int star = 1; star <= (2 * i) - 1; star++) {
				System.out.print("*");
			}

			// Step 3: go to next line
			System.out.println();
		}
} }

//Output:
//    *
//   ***
//  *****
// *******
//*********