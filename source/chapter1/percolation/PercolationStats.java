import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

public class PercolationStats {

    private double[] threshold;
    private int trialCount;
    private double mean;
    private double stddev;

    public PercolationStats(int size, int trials) {
        if (size < 0 || trials < 0) {
            throw new IllegalArgumentException("n and trials must be greater than 0");
        }

        threshold = new double[trials];
        trialCount = trials;
        mean = 0.0;
        stddev = 0.0;


        for (int i = 0; i < trials; i++) {
            int row, col;
            Percolation percolation = new Percolation(size);

            Stopwatch timer = new Stopwatch();
            while (!percolation.percolates()) {
                row = StdRandom.uniform(0, size);
                col = StdRandom.uniform(0, size);
                percolation.open(row, col);
            }
            StdOut.println(timer.elapsedTime());

            threshold[i] = percolation.numberOfOpenSites() / Math.pow((double) size, 2);
        }


        StdOut.println("mean: " + mean());
        StdOut.println("stddev: " + stddev());
        StdOut.println("95% confidence interval: " + "[" + confidenceLo() + "," + confidenceHi() + "]");
    }

    public double mean() {
        double sum = 0.0;

        for (int i = 0; i < trialCount; i++) {
            sum += threshold[i];
        }
        mean = sum / trialCount;
        return mean;
    }

    public double stddev() {
        double s = 0.0;
        for (int i = 0; i < trialCount; i++) {
            s += Math.pow((threshold[i] - mean), 2);
        }
        stddev = Math.sqrt(s / (trialCount - 1));
        return stddev;
    }

    public double confidenceLo() {
        return mean - (1.96 * stddev) / Math.sqrt(trialCount);
    }

    public double confidenceHi() {
        return mean + (1.96 * stddev) / Math.sqrt(trialCount);
    }

    public static void main(String[] args) {
        int size = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        PercolationStats stats = new PercolationStats(size, trials);

    }

}
