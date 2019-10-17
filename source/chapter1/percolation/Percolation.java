import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

public class Percolation {

    private int N;
    private int OpenSiteCount;
    private int[][] status; // blocked: 0   open: 1
    private int[][] id;     // root
    private int[][] treeSize;   // fpr weighted

    public Percolation(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be greater than 0");
        }

        N = n;
        OpenSiteCount = 0;
        status = new int[N][N];
        id = new int[N][N];
        treeSize = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                status[i][j] = 0;
                treeSize[i][j] = 1;
                id[i][j] = i * N + j;
            }
        }
    }

    public void open(int row, int col) {
        if (row < 0 || row >= N || col < 0 || col >= N) {
            throw new IllegalArgumentException(("Out of range!"));
        }

        if (isOpen(row, col)) {
            return;
        }

        status[row][col] = 1;

        if (row - 1 >= 0 && isOpen(row - 1, col)) {
            union(row, col, row - 1, col);
        }

        if (row + 1 < N && isOpen(row + 1, col)) {
            union(row, col, row + 1, col);
        }

        if (col - 1 >= 0 && isOpen(row, col - 1)) {
            union(row, col, row, col - 1);
        }

        if (col + 1 < N && isOpen(row, col + 1)) {
            union(row, col, row, col + 1);
        }

        OpenSiteCount++;
    }

    public boolean isOpen(int row, int col) {
        if (row < 0 || row >= N || col < 0 || col >= N) {
            throw new IllegalArgumentException(("Out of range!"));
        }

        return status[row][col] == 1;
    }

    public boolean isFull(int row, int col) {
        if (row < 0 || row >= N || col < 0 || col >= N) {
            throw new IllegalArgumentException(("Out of range!"));
        }

        return OpenSiteCount == (N * N);
    }

    public int numberOfOpenSites() {
        return OpenSiteCount;
    }

    public boolean percolates() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (connected(0, i, N - 1, j)) {
                    return true;
                }
            }
        }

        return false;
    }

    private int find(int row, int col) {
        int tempRow;
        while (row * N + col != id[row][col]) {
            tempRow = row;
            row = id[row][col] / N;
            col = id[tempRow][col] % N;
        }

        return id[row][col];
    }

    private boolean connected(int p_row, int p_col, int q_row, int q_col) {
        if (p_row == q_row && p_col == q_col) {
            throw new IllegalArgumentException("Input sites cannot be the same!");
        }
        return find(p_row, p_col) == find(q_row, q_col);
    }

    private void union(int p_row, int p_col, int q_row, int q_col) {
        if (p_row == q_row && p_col == q_col) {
            return;
        }
        int i = find(p_row, p_col);
        int j = find(q_row, q_col);

        if (i == j) {
            return;
        }

        int i_row = i / N;
        int i_col = i % N;
        int j_row = j / N;
        int j_col = j % N;

        if (treeSize[i_row][i_col] < treeSize[j_row][j_col]) {
            id[i_row][i_col] = j;
            treeSize[j_row][j_col] += treeSize[i_row][i_col];
        } else {
            id[j_row][j_col] = i;
            treeSize[i_row][i_col] += treeSize[j_row][j_col];
        }
    }

    private void PrintId() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                StdOut.print(status[i][j] + " ");
            }
            StdOut.println();
        }
        StdOut.println();
    }

    public static void main(String[] args) {
        int size = Integer.parseInt(args[0]);

        Percolation percolation = new Percolation(size);

        int row, col;
        Stopwatch timer = new Stopwatch();

        while (!percolation.percolates()) {
            row = StdRandom.uniform(0, size);
            col = StdRandom.uniform(0, size);
            percolation.open(row, col);
        }
        StdOut.println("OpenSites: " + percolation.numberOfOpenSites());
        StdOut.println(timer.elapsedTime());
    }
}
