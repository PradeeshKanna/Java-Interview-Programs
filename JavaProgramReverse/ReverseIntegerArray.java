package JavaProgramReverse;

public class ReverseIntegerArray {
	
	public static void main(String[] args) {
		int num[]= {1,2,3,4,5};
		int revNum[]= new int[num.length];		// same size to store reversed values
		
		// Index for reversed array
		int revIndex=0;
		
		for(int i=num.length-1;i>=0;i--) {
			revNum[revIndex]=num[i];		// Store reversed value in revNum
			revIndex++;						// Move to the next position in revNum
		}
		
		// Print the reversed array
		for(int r: revNum)
		System.out.println(r);				 
	}
}

// Output: 5 4 3 2 1