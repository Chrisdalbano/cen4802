/**
 * The {@code Fibonacci} class provides utility methods for working with Fibonacci sequences.
 * It includes methods to print a sequence up to a specified number of terms
 * and to retrieve the value at a specific position in the sequence.
 *
 * <p>The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding ones,
 * typically starting with 0 and 1.</p>
 */

public class Fibonacci {
    static void recursiveSequence(int n) {
        int n1 = 0, n2 = 1;

        for (int i =0; i < n; i++){
            //print number
           System.out.print(n1 + " ");

            // Swapping numbers
            int n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
        }
    }

    /**
     * Prints the value at the {@code nthTerm} position in the Fibonacci sequence.
     * The sequence is zero-indexed: term 0 is 0, term 1 is 1, term 2 is 1, and so on.
     *
     * @param n        the number of terms to generate. Used as an upper limit for validation.
     * @param nthTerm  the index of the Fibonacci term to retrieve (0-based). Must be less than {@code n}.
     * @throws IllegalArgumentException if {@code nthTerm} is greater than or equal to {@code n}.
     */

    static void getNthTerm(int n, int nthTerm) {
        if (nthTerm > n) {
            throw new IllegalArgumentException("Parameter nthTerm must be less than n");
        }

        int n1 = 0, n2 = 1;

        for (int i = 0; i < n; i++) {
            if (i == nthTerm - 1) {
                System.out.printf("The %d-th term of the Fibonacci sequence is %d\n", nthTerm, n1);
                return;
            }

            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }

}
