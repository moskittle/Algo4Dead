import edu.princeton.cs.algs4.StdOut;

public class Ex1_1_20 {

    private static double Ln_Factorial(int N) {
        // ln(N!) = ln(n) + ln(n-1) + ln(n-2) + ... + ln(2) + ln(1)
        if (N == 1) return Math.log(1);
        return Math.log(N) + Ln_Factorial(N - 1);
    }

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            StdOut.println(i + " " + Ln_Factorial(i));
        }
    }

}
