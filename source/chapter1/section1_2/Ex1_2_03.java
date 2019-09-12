import edu.princeton.cs.algs4.*;

import java.util.HashMap;
import java.util.Map;

public class Ex1_2_03 {

    private static Map<Interval2D, Interval1D[]> interval2DMap = new HashMap<>();

    private static Interval1D CreateInterval1D(int scale) {
        double left = scale * StdRandom.uniform();
        double right = scale * StdRandom.uniform();

        if (left > right) {
            double temp = left;
            left = right;
            right = temp;
        }

        return new Interval1D(left, right);
    }

    private static void CreateAndDrawIntervals2D(Interval2D[] intervals, int min, int max, int scale) {
        StdDraw.setCanvasSize(scale, scale);
        StdDraw.setPenRadius(0.005);
        StdDraw.setXscale(0, scale);
        StdDraw.setYscale(0, scale);

        for (int i = 0; i < intervals.length; i++) {
            Interval1D width = CreateInterval1D(scale);
            Interval1D height = CreateInterval1D(scale);
            Interval1D[] interval1Ds = {width, height};

            intervals[i] = new Interval2D(width, height);

            interval2DMap.put(intervals[i], interval1Ds);

            StdDraw.line(width.min(), height.max(), width.max(), height.max());
            StdDraw.line(width.max(), height.max(), width.max(), height.min());
            StdDraw.line(width.max(), height.min(), width.min(), height.min());
            StdDraw.line(width.min(), height.min(), width.min(), height.max());
        }
    }

    private static int CountIntersect(Interval2D[] intervals) {
        int result = 0;

        StdOut.println("Intersecting pair:");
        for (int i = 0; i < intervals.length; i++) {
            for (int j = i + 1; j < intervals.length; j++) {
                if (intervals[i].intersects(intervals[j])) {
                    result++;
                    StdOut.printf("Interval[%d]=" + intervals[i] + " Interval[%d]=" + intervals[j] + "\n", i, j);
                }
            }
        }
        return result;
    }

    private static Point2D[] GetVertices(Interval2D interval2D) {
        Point2D[] points = new Point2D[4];
        points[0] = new Point2D(interval2DMap.get(interval2D)[0].min(), interval2DMap.get(interval2D)[1].min());
        points[1] = new Point2D(interval2DMap.get(interval2D)[0].min(), interval2DMap.get(interval2D)[1].max());
        points[2] = new Point2D(interval2DMap.get(interval2D)[0].max(), interval2DMap.get(interval2D)[1].max());
        points[3] = new Point2D(interval2DMap.get(interval2D)[0].max(), interval2DMap.get(interval2D)[1].min());

        return points;
    }

    private static int CountContain(Interval2D[] intervals) {
        int count = 0;
        boolean isContained = true;

        StdOut.println("Containing pair:");
        for (int i = 0; i < intervals.length; i++) {
            for (int j = 0; j < intervals.length; j++) {
                if (intervals[i].equals(intervals[j])) {
                    continue;
                }

                Point2D[] points = new Point2D[4];
                points = GetVertices(intervals[j]);
                if (intervals[i].contains(points[0]) && intervals[i].contains(points[1]) &&
                        intervals[i].contains(points[2]) && intervals[i].contains(points[3])) {
                    count++;
                    StdOut.printf("Interval[%d]=" + intervals[i] + " contains Interval[%d]=" + intervals[j] + "\n", i, j);
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int count = Integer.parseInt(args[0]);
        int min = Integer.parseInt(args[1]);
        int max = Integer.parseInt(args[2]);
        int scale = max - min;

        Interval2D[] intervals = new Interval2D[count];
        CreateAndDrawIntervals2D(intervals, min, max, scale);

        StdOut.printf("Numbers of pairs of intersecting: %3d\n", CountIntersect(intervals));
        StdOut.printf("Numbers of pairs of containing: %3d\n", CountContain(intervals));
    }

}
