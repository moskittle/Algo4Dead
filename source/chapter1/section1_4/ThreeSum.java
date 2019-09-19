import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class ThreeSum {

    public static int count(int[] a) {
        int N = a.length;
        int cnt = 0;

        for (int i = 0; i < N; i++)
            for (int j = i + 1; j < N; j++)
                for (int k = j + 1; k < N; k++)
                    if (a[i] + a[j] + a[k] == 0)
                        cnt++;
        return cnt;
    }

    public static class Stopwatch {
        private final long start;

        public Stopwatch() {
            start = System.currentTimeMillis();
        }

        public double elapseTime() {
            long now = System.currentTimeMillis();
            return (now - start) / 1000.0;
        }
    }

    edu.princeton.cs.algs4.ThreeSum

    public static double timeTrial(int N) {
        int MAX = 1000000;
        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            a[i] = StdRandom.uniform(-MAX, MAX);
        }

        Stopwatch stopwatch = new Stopwatch();
        int count = ThreeSum.count(a);
        return stopwatch.elapseTime();
    }

    public static void main(String[] args) {
        for (int N = 250; N < 10000; N += N) {
            double time = timeTrial(N);
            StdOut.printf("%7d %5.3f\n", N, time);
        }
    }

}
