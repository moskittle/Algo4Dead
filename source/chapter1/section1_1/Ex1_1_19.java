import edu.princeton.cs.algs4.StdOut;

public class Ex1_1_19 {

    private static long inefficientF(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return F(N - 1) + F(N - 2);
    }

    private static long F(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;

        long[] a = new long[N + 1];

        a[0] = 0;
        a[1] = 1;

        for (int i = 2; i < N + 1; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }

        return a[N];
    }

    public static void main(String[] args) {
        for (int N = 0; N < 100; N++) {
            StdOut.println(N + " " + F(N));
        }
    }

}
