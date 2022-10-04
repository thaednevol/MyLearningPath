package co.knry.algorithms.interview;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PalindromeInPi {

    public static void main(String... args) throws IOException {
        String input = new String(Files.readAllBytes(Paths.get("C:\\Users\\Hernan\\Desktop\\Pi\\Pi.txt")));

        for (int i = 0; i < input.length() - 32; i++) {
            String s2 = input.substring(i, i + 12);

            if (isPalindrome(s2) && isPrime(s2)) {
                System.out.println(s2);
                break;
            }
        }
    }

    private static boolean isPrime(String s2) {
        BigInteger n = new BigInteger(s2);
        BigInteger TWO = BigInteger.ONE.add(BigInteger.ONE);
        if (n.mod(TWO).equals(BigInteger.ZERO)) {
            return false;
        }
        BigInteger h = TWO.add(BigInteger.ONE);
        // for (; h * h < n; h += 2)
        for (; h.multiply(h).compareTo(n) < 0; h = h.add(TWO)) {
            if (n.mod(h).equals(BigInteger.ZERO)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
