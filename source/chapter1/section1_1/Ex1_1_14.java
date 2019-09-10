import edu.princeton.cs.algs4.StdOut;

public class Ex1_1_14 {

    private static int lg(int N) {
        int exponent = 0;
        for (int i = 1; i * 2 < N; i *= 2) {
            exponent++;
        }

        return exponent;
    }

    public static void main(String[] args) {
        StdOut.println(lg(100));
        StdOut.println(lg(1400));
    }

}
