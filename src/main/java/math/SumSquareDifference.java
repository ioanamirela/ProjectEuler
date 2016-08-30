package math;

/**
 * Created by Ioana on 30/08/2016.
 *
 * The sum of the squares of the first ten natural numbers is,

 1^2 + 2^2 + ... + 10^2 = 385
 The square of the sum of the first ten natural numbers is,

 (1 + 2 + ... + 10)^2 = 552 = 3025
 Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

 Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class SumSquareDifference {

    /**
     * computes sum of squares using the mathematical formula
     * n(n+1)(2n+1) / 6
     * @param n
     * @return
     */
    public int sumOfSquares(int n){
        return n*(n+1)*(2*n+1)/6;
    }

    /**
     * computes square of sum of first n numbers using formula
     * (1+2+...+n)^2 = (n(n+1)/2)^2 = n^2 * (n+1) ^2  / 4
     * @param n
     * @return
     */
    public int squareOfSums(int n){
        return (n*n) * ((n+1)*(n+1)) / 4;
    }
}
