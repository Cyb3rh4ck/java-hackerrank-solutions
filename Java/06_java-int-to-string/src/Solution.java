import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        // TODO: Complete this method to convert int to string
        String s = Integer.toString(n);
        
        // HackerRank's automated checking code (usually provided by the platform)
        if (s.equals(String.valueOf(n))) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }
        
        scanner.close();
    }

}
