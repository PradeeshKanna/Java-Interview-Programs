package JavaProgramDuplicate;

public class RemoveDuplicateFromStringArray {
	   public static void main(String[] args) {

		   String arr[] = {"apple", "banana","apple", "cherry"};

	        for (int i = 0; i < arr.length; i++) {
	            boolean isDuplicate = false;  

	            // Check if arr[i] has appeared earlier in the array
	            for (int j = 0; j < i; j++) {
	                if (arr[i].equals(arr[j])) {
	                    isDuplicate = true; 
	                    break;              
	                }
	            }

	            // If it's not a duplicate, print the element
	            if (!isDuplicate) {
	                System.out.print(arr[i] + " ");
	            }
	        }
}}