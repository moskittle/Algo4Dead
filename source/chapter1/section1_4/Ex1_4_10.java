import edu.princeton.cs.algs4.StdOut;

public class Ex1_4_10 {

    public static int binarySeach(int[] a, int key, int lo, int hi) {
        if (lo <= hi) {
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
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] input = new int[200];

        for (int i = 0; i < input.length - 1; i += 2) {
            input[i] = i / 2;
            input[i + 1] = i / 2;
        }
        for (int i : input) {
            StdOut.print(i + " ");
        }
        StdOut.println();

        int lo = 0;
        int hi = input.length - 1;
        int index = binarySeach(input, 2, lo, hi);

        StdOut.println("index: " + index);
    }

}
