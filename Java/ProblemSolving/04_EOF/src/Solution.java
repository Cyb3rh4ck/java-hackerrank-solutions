import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read lines until EOF
        int lineNumber = 1;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(lineNumber + " " + line);
            lineNumber++;
        }
        
        scanner.close();
    }

}
