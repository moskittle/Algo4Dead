import edu.princeton.cs.algs4.StdOut;

public class Ex1_1_09 {

    private static void BinaryToString(int n) {
        String result = "";
        for (int i = n; i > 0; i /= 2) {
            result = (i % 2) + result;
        }
        StdOut.println(result);
    }

    public static void main(String[] args) {
        BinaryToString(8);
        BinaryToString(31);
        BinaryToString(1023);
    }

}
