import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of queries
        
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            
            // Generate and print the series
            for (int j = 0; j < n; j++) {
                // Calculate sum of powers of 2 from 2^0 to 2^j
                int powerSum = (1 << (j + 1)) - 1; // This is 2^(j+1) - 1
                int term = a + b * powerSum;
                
                System.out.print(term);
                if (j < n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println(); // New line after each series
        }
        
        scanner.close();
    }
}
