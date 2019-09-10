import edu.princeton.cs.algs4.StdOut;

public class Ex1_1_11 {
    private static void DisplayBooleanArray(boolean[][] boolArray) {
        for (int i = 0; i < boolArray.length; i++) {
            for (int j = 0; j < boolArray[0].length; j++) {
                if (boolArray[i][j]) {
                    StdOut.print("*");
                } else {
                    StdOut.print(" ");
                }
                StdOut.print(" ");
            }
            StdOut.println();
        }
    }

    public static void main(String[] args) {
        boolean[][] array = {
                {true, true, false, true, false},
                {false, false, true, false, true},
                {true, true, false, true, false},
                {false, true, false, false, false},
                {true, true, false, false, true}
        };
        DisplayBooleanArray(array);
    }

}
