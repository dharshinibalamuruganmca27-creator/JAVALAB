import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // 1. Read Integer
        int i = scan.nextInt();
        
        // 2. Read Double
        double d = scan.nextDouble();
        
        /* 
           Crucial Step: Clear the buffer!
           After nextDouble(), there is a newline character (\n) left behind.
           We must call nextLine() once to "swallow" it before reading the actual String.
        */
        scan.nextLine(); 
        
        // 3. Read String
        String s = scan.nextLine();

        // Write your output here
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        
        scan.close();
    }
}
