import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int t = scanner.nextInt();
            while (t-- > 0) {
                BigInteger n = scanner.nextBigInteger();
                if (n.bitLength() < Long.SIZE) {
                    System.out.println(n + " can be fitted in:");
                } else {
                    System.out.println(n + " can't be fitted anywhere.");
                    continue;
                }
                if (n.bitLength() < Byte.SIZE) {
                    System.out.println("* byte");
                }
                if (n.bitLength() < Short.SIZE) {
                    System.out.println("* short");
                }
                if (n.bitLength() < Integer.SIZE) {
                    System.out.println("* int");
                }
                if (n.bitLength() < Long.SIZE) {
                    System.out.println("* long");
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
