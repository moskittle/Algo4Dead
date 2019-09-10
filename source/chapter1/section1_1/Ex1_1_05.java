import edu.princeton.cs.algs4.StdOut;

public class Ex1_1_05 {

    private static boolean IsinRange(double x, double y) {
        return 0.0 < x && x < 1.0 && 0.0 < y && y < 1.0f;
    }

    public static void main(String[] args) {
        StdOut.println(IsinRange(0.1, 1.2));
        StdOut.println(IsinRange(0.5, 1.8));
        StdOut.println(IsinRange(0.6, 0.2));
    }

}
