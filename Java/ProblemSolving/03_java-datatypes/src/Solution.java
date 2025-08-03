import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // consume the newline after the number
        
        for (int i = 0; i < t; i++) {
            String numberStr = scanner.nextLine().trim();
            
            try {
                // Use BigInteger to handle arbitrarily large numbers
                BigInteger number = new BigInteger(numberStr);
                
                // Define the ranges for each primitive type
                BigInteger byteMin = BigInteger.valueOf(Byte.MIN_VALUE);
                BigInteger byteMax = BigInteger.valueOf(Byte.MAX_VALUE);
                BigInteger shortMin = BigInteger.valueOf(Short.MIN_VALUE);
                BigInteger shortMax = BigInteger.valueOf(Short.MAX_VALUE);
                BigInteger intMin = BigInteger.valueOf(Integer.MIN_VALUE);
                BigInteger intMax = BigInteger.valueOf(Integer.MAX_VALUE);
                BigInteger longMin = BigInteger.valueOf(Long.MIN_VALUE);
                BigInteger longMax = BigInteger.valueOf(Long.MAX_VALUE);
                
                // Check which data types can store the number
                boolean canFit = false;
                StringBuilder result = new StringBuilder();
                
                if (number.compareTo(byteMin) >= 0 && number.compareTo(byteMax) <= 0) {
                    result.append("* byte\n");
                    canFit = true;
                }
                if (number.compareTo(shortMin) >= 0 && number.compareTo(shortMax) <= 0) {
                    result.append("* short\n");
                    canFit = true;
                }
                if (number.compareTo(intMin) >= 0 && number.compareTo(intMax) <= 0) {
                    result.append("* int\n");
                    canFit = true;
                }
                if (number.compareTo(longMin) >= 0 && number.compareTo(longMax) <= 0) {
                    result.append("* long\n");
                    canFit = true;
                }
                
                if (canFit) {
                    System.out.println(numberStr + " can be fitted in:");
                    System.out.print(result.toString());
                } else {
                    System.out.println(numberStr + " can't be fitted anywhere.");
                }
                
            } catch (NumberFormatException e) {
                // If the number is not a valid integer
                System.out.println(numberStr + " can't be fitted anywhere.");
            }
        }
        
        scanner.close();
    }
}