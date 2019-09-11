import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Ex1_2_2 {

    private static boolean intersect(Interval1D i0, Interval1D i1) {
/*        if(){
            return true;
        } else if () {

        }*/
        return (i0.min() < i1.min() && i0.max() > i1.min()) || (i1.min() < i0.min() && i1.max() > i0.min());
    }

    private static void CreateIntervals(Interval1D[] intervals, int count, int scale) {
        for (int i = 0; i < count; i++) {
            double left = scale * StdRandom.uniform();
            double right = scale * StdRandom.uniform();

            if (left > right) {
                double temp = left;
                left = right;
                right = temp;
            }

            intervals[i] = new Interval1D(left, right);
        }
    }

    private static void PrintIntervals(Interval1D[] intervals) {
        for (Interval1D interval : intervals) {
            StdOut.println(interval);
        }
    }

    public static void main(String[] args) {
        int count = Integer.parseInt(args[0]);
        Interval1D[] intervals = new Interval1D[count];
        int scale = 100;

        CreateIntervals(intervals, count, scale);
        PrintIntervals(intervals);

        for (int i = 0; i < intervals.length; i++) {
            for (int j = i + 1; j < intervals.length; j++) {
                if (intersect(intervals[i], intervals[j])) {
                    StdOut.printf("Interval[%d] and Interval[%d] intersects\n", i, j);
                }
            }
        }
    }

}
