package JavaProgramBasics;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

// Using DateTimeFormatter
public class DateTime1 {
    
    public static void main(String[] args) {
        
        // 1. Get current date, time, and datetime
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDateTime currentDateTime = LocalDateTime.now();
        
        // 2. Print the date, time, and datetime
        System.out.println(currentDate);
        System.out.println(currentTime);
        System.out.println(currentDateTime);

        // 3. Define DateTimeFormatter with desired formats
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss a");	// 12hrs(hh) and 24hrs(HH) and if require AM/PM(a)
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        
        // 4. Format and print the date, time, and datetime
        System.out.println("Current Date: " + currentDate.format(dateFormatter));
        System.out.println("Current Time: " + currentTime.format(timeFormatter));
        System.out.println("Current DateTime: " + currentDateTime.format(dateTimeFormatter));
    }
}

//Output:

//2026-02-09
//20:07:15.386073900 
//2026-02-09T20:07:15.386073900

//Current Date: 2026-02-09
//Current Time: 20:07:15
//Current DateTime: 2026-02-09 20:07:15

