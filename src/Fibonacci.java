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
