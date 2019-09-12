import edu.princeton.cs.algs4.StdOut;

public class Ex1_2_06 {

    private static boolean CheckCircularRotation(String s0, String s1) {
        if (s0.length() != s1.length()) {
            return false;
        }

        for (int i = 0; i < s0.length(); i++) {
            String temp = s0.substring(i, s0.length()) + s0.substring(0, i);
            if (temp.equals(s1)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String s0 = "ACTGACG";
        String s1 = "TGACGAC";

        if (CheckCircularRotation(s0, s1)) {
            StdOut.printf(s0 + " and " + s1 + " are a circular rotation pair.\n");
        } else {
            StdOut.printf(s0 + " and " + s1 + " are not a circular rotation pair.\n");
        }
    }

}
