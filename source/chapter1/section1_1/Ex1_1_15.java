import edu.princeton.cs.algs4.StdOut;

public class Ex1_1_15 {

    private static int[] Histogram(int[] a, int M) {
        int[] result = new int[M];

        for (int value : a) {
            if (value < M) {
                result[value]++;
            }
        }

        CheckRange(result, a.length);

        return result;
    }

    private static void CheckRange(int[] a, int size) {
        int count = 0;

        for (int value : a) {
            count += value;
        }

        if (count == size) {
            StdOut.println("All values in array is within range.");
        } else {
            StdOut.println("Some values in array is out of range.");

        }
    }

    private static void DisplayArray(int[] a) {
        for (int value : a) {
            StdOut.print(value + " ");
        }
        StdOut.println();
    }

    public static void main(String[] args) {
        int[] array = {
                1, 2, 2, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 9
        };

        DisplayArray((Histogram(array, 10)));
        DisplayArray((Histogram(array, 8)));
    }

}
