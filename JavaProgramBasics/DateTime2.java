package JavaProgramBasics;

import java.text.SimpleDateFormat;
import java.util.Date;

// Using SimpleDateFormat
public class DateTime2 {

    public static void main(String[] args) {
        
        // 1. Get current date and time
        Date currentDate = new Date();  
        
        // 2. Define SimpleDateFormat for date, time, and datetime
        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat timeFormatter = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat dateTimeFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
        // 3. Format and print the date, time, and datetime
        System.out.println("Current Date: " + dateFormatter.format(currentDate));
        System.out.println("Current Time: " + timeFormatter.format(currentDate));
        System.out.println("Current DateTime: " + dateTimeFormatter.format(currentDate));
    }
}

// Output:
// Current Date: 2026-02-09
// Current Time: 20:12:46
// Current DateTime: 2026-02-09 20:12:46
