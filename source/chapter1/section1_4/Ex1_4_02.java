import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class Ex1_4_02 {

    public static int count(int[] a) {
        int size = a.length;
        int cnt = 0;

        long result;

        Arrays.sort(a);
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                for (int k = j + 1; k < size; k++) {
                    result = a[i] + a[j] + a[k];
                    if (result == 0) {
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        String filePath = args[0];
        In in = new In(filePath);

        int[] a = in.readAllInts();
        StdOut.println("Count: " + count(a));

    }

}
