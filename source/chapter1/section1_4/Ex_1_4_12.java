import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

import java.util.Arrays;

public class Ex_1_4_12 {

    public static double timerTrial(int size) {
        int MAX = 100;
        int[] a = new int[size];
        int[] b = new int[size * 2];

        for (int i = 0; i < size; i++) {
            a[i] = StdRandom.uniform(0, MAX);
            b[i] = StdRandom.uniform(0, MAX);
        }
        Arrays.sort(a);
        Arrays.sort(b);

        Stopwatch stopwatch = new Stopwatch();
        if (a.length < b.length) {
            FindCommon(a, b);
        } else {
            FindCommon(b, a);
        }

        return stopwatch.elapsedTime();
    }

    public static void FindCommon(int[] a, int[] b) {
        int startIndex = 0;

        for (int i = 0; i < a.length - 1; i++) {
            if (i > 0 && a[i] == a[i - 1]) {
                continue;
            }

            while (a[i] > b[startIndex]) {
                if (startIndex < b.length - 2) {
                    startIndex++;
                }
            }
            if (a[i] == b[startIndex]) {
                StdOut.println(a[i]);
                startIndex++;
            }
        }
    }

    public static void main(String[] args) {
        for (int size = 10; size < 100; size += size) {
            StdOut.println("time: " + timerTrial(size));
        }
    }

}
