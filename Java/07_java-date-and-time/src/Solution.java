import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Solution {
    
    public static String findDay(int month, int day, int year) {
        // Create a LocalDate object with the given date
        LocalDate date = LocalDate.of(year, month, day);
        
        // Get the day of week and return it in uppercase
        return date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH).toUpperCase();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read month, day, year
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int year = scanner.nextInt();
        
        // Find and print the day of the week
        String dayOfWeek = findDay(month, day, year);
        System.out.println(dayOfWeek);
        
        scanner.close();
    }
}
