import edu.princeton.cs.algs4.StdOut;

public class Ex1_1_13 {

    private static int[][] Transpose(int[][] mat) {
        int[][] result = new int[mat[0].length][mat.length];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                result[j][i] = mat[i][j];
            }
        }

        return result;
    }

    private static void DisplayMatrix(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                StdOut.print(mat[i][j] + " ");
            }
            StdOut.println();
        }
    }

    public static void main(String[] args) {
        int[][] mat = {
                {0, 0, 0, 0, 0},
                {1, 1, 1, 1, 1},
                {2, 2, 2, 2, 2},
                {3, 3, 3, 3, 3},
                {4, 4, 4, 4, 4}
        };

        DisplayMatrix(Transpose(mat));
    }

}
