package math;

import messages.EulerMessage;

/**
 * Created by Ioana on 21/05/2016.
 *
 A palindromic number reads the same both ways.
 The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

 Find the largest palindrome made from the product of two 3-digit numbers.

 */
public class LargestPalindromeProduct {

    /**
     * Computes reverse of given number
     * @param n
     * @return
     */
    private int reverse(int n) {
        int result = 0;
        while (n != 0) {
            int lastDigit = n % 10;
            result = result * 10 + lastDigit;
            n = n / 10;
        }
        return result;
    }

    /**
     * Checks if number is palindrome (equals reverse)
     * @param n
     * @return
     */
    private boolean isPalindrome(int n) {
        return n == reverse(n);
    }

    /**
     * Recursive method to calculate power
     * @param x
     * @param n
     * @return
     */
    private int pow(int x, int n)
    {
        if (n == 0)
            return 1;
        else
            return x * pow(x, n - 1);
    }

    public int computeLargestPalindrome(int digits) throws EulerMessage {
        if (digits < 2)
            throw new EulerMessage("At least 2 digits required for computing");

        // find first and last n digit number (start and end)
        int start = pow(10, digits-1);
        int end = pow(10, digits)-1;
        int product = 0;
        for (int i = end; i > start; i--) {
            for (int j = i; j > i - start; j--) {
                product = i * j;
                if (isPalindrome(product)) {
                    return product;
                }
            }
        }
        throw new EulerMessage("Palindrome not found");
    }
}
