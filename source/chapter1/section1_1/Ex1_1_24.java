import edu.princeton.cs.algs4.StdOut;

public class Ex1_1_24 {
    private static int gcd(int p, int q) {
        if (q == 0) {
            return p;
        }

        int r = p % q;

        StdOut.printf("%9d%8d%8d\n", p, q, r);
        return gcd(q, r);
    }

    private static void PrintGcd(int p, int q) {
        StdOut.println("\t\tp\t\tq\t\tr");
        StdOut.printf("The greatest common divisor of %d and %d is %d\n", p, q, gcd(p, q));
        StdOut.println();
    }

    public static void main(String[] args) {
        int p = Integer.parseInt(args[0]);
        int q = Integer.parseInt(args[1]);

        PrintGcd(105, 24);
        PrintGcd(p, q);
        PrintGcd(1111111, 1234567);
    }

}
