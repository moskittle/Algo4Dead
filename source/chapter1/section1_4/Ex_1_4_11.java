import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

public class Ex_1_4_11 {


    public static double timerTrial(int size, int key) {
        int MAX = 5;
        int[] a = new int[size];


        for (int i = 0; i < size; i++) {
            a[i] = StdRandom.uniform(0, MAX);
        }
        Stopwatch stopwatch = new Stopwatch();
        StdOut.println("size: " + size + " count: " + howMany(a, key));
        return stopwatch.elapsedTime();
    }

    public static int howMany(int[] a, int key) {
        int cnt = 0;
        int startIndex = binarySeach(a, key, 0, a.length);

        for (int i = startIndex; 0 < i && i < a.length; i++) {
            if (a[i] == key) {
                cnt++;
            }
        }

        return cnt;
    }


    public static int binarySeach(int[] a, int key, int lo, int hi) {
        if (lo >= hi) {
            return -1;
        }

        // Key is in a[lo..hi] or not present.
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) {
            return binarySeach(a, key, lo, mid - 1);
        } else if (key > a[mid]) {
            return binarySeach(a, key, mid + 1, hi);
        } else {
            int smallerIndex = binarySeach(a, key, lo, mid - 1);

            if (smallerIndex == -1) {
                return mid;
            } else {
                return smallerIndex;
            }
        }

    }

    public static void main(String[] args) {

        int key = 5;

        for (int size = 100; size < 10000; size += size) {
            timerTrial(size, key);
        }
    }

}
