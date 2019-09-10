import edu.princeton.cs.algs4.StdOut;

public class Ex1_1_23 {

    private static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1, 0);
    }

    private static int rank(int key, int[] a, int low, int high, int depth) {
        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;
        if (key < a[mid]) {
            return rank(key, a, low, mid - 1, depth);
        } else if (key > a[mid]) {
            return rank(key, a, mid + 1, high, depth);
        } else {
            return mid;
        }
    }

    private static void BinarySearch(int[] keys, int[] a, char operator) {
        for (int value : keys) {
            int pos = rank(value, a);

            if (operator == '+' && pos >= 0) {
                StdOut.print(value + " ");
            } else if (operator == '-' && pos == -1) {
                StdOut.print(value + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] a = new int[100];
        int[] input = {
                1, 11, 111, 2, 22, 222, 3, 33, 333
        };

        for (int i = 0; i < 100; i++) {
            a[i] = i;
        }

        BinarySearch(input, a, '+');
        StdOut.println();
        BinarySearch(input, a, '-');
        StdOut.println();
    }

}
