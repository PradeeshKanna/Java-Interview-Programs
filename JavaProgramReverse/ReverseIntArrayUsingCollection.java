package JavaProgramReverse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// Reverse the Integer Array using Collection

public class ReverseIntArrayUsingCollection {
    public static void main(String[] args) {
        // Original array
        Integer[] arr = {1, 2, 3, 4, 5};
        
        // Convert the array to an ArrayList
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        
        // Reverse the ArrayList
        Collections.reverse(list);
        
        // Print the reversed ArrayList
        System.out.println("Reversed array:");
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
