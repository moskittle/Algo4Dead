import edu.princeton.cs.algs4.StdOut;

public class Ex1_1_07 {

    private static double funcA() {
        double t = 9.0;
        while (Math.abs(t - 9.0 / t) > 0.01) {
            t = (9.0f / t + t) / 2.0f;
        }
        return t;
    }

    private static int funcB() {
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        return sum;
    }

    private static int funcC() {
        int sum = 0;
        for (int i = 1; i < 1000; i *= 2) {
            for (int j = 0; j < 1000; j++) {
                sum++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        StdOut.println(funcA());
        StdOut.println(funcB());
        StdOut.println(funcC());
    }

}
