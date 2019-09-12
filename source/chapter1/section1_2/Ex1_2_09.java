import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class Ex1_2_09 {

    private static int rank(int key, int[] array, Counter counter) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (key < array[mid]) {
                high = mid - 1;
            } else if (key > array[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
            counter.increment();
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] whitelist = new int[100];
        for (int i = 0; i < 100; i++) {
            whitelist[i] = i + 1;
        }
        Arrays.sort(whitelist);

        Counter counter = new Counter("BinarySearch");

        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (rank(key, whitelist, counter) < 0) {
                StdOut.println(key);
            }
        }
        StdOut.printf("The total searches: %d.", counter.tally());
    }

}
