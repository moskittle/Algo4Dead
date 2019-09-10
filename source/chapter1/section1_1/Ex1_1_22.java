import edu.princeton.cs.algs4.StdOut;

public class Ex1_1_22 {

    private static int rank(int key, int[] a) {
        StdOut.println("Depth   Low     High");
        return rank(key, a, 0, a.length - 1, 0);
    }

    private static int rank(int key, int[] a, int low, int high, int depth) {
        depth++;
        StdOut.printf("%5d%6d%9d\n", depth, low, high);

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

    public static void main(String[] args) {
        int[] a = new int[100];

        for (int i = 0; i < 100; i++) {
            a[i] = i;
        }

        rank(10, a);
    }

}
