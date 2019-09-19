import edu.princeton.cs.algs4.BinarySearch;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

import java.util.Arrays;

public class Ex1_4_08 {

    public static double timerTrial(int size) {
        int MAX = 10000;
        int[] a = new int[size];


        for (int i = 0; i < size; i++) {
            a[i] = StdRandom.uniform(-MAX, MAX);
        }
        Stopwatch stopwatch = new Stopwatch();
        identical(a);
        return stopwatch.elapsedTime();
    }

    public static int identical(int[] a) {
        int cnt = 0;
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            if (BinarySearch.indexOf(a, a[i]) > i) {
                cnt++;
            }
        }
        StdOut.println("count: " + cnt);
        return cnt;
    }

    public static void main(String[] args) {
        for (int size = 10; true; size += size) {
            double time = timerTrial(size);
            StdOut.println("size: " + size + " time " + time);
        }
    }

}
