import edu.princeton.cs.algs4.StdOut;

public class Ex1_1_03 {

    public static void main(String[] args) {
        int i0 = Integer.parseInt((args[0]));
        int i1 = Integer.parseInt((args[1]));
        int i2 = Integer.parseInt((args[2]));

        if (i0 == i1 && i1 == i2) {
            StdOut.println("true");
        } else {
            StdOut.println("false");
        }
    }

}

// Note:
// 1. String args[] is C-style; Use String[] args.
// 2. args can only be type String[]; Use parse functions to fetch other types
