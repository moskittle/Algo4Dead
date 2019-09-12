import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.awt.*;

public class Ex1_2_01 {

    private static double CalcDistance(Point2D p0, Point2D p1) {
        return Math.sqrt((p0.y() - p1.y()) * (p0.y() - p1.y()) + (p0.x() - p1.x()) * (p0.x() - p1.x()));
    }

    private static double GetMinDistance(Point2D[] points) {
        double min = Double.MAX_VALUE;

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = CalcDistance(points[i], points[j]);
                if (distance < min) {
                    min = distance;
                    StdOut.printf("Point[%d] (%.2f, %.2f) and Point[%d] (%.2f, %.2f)\n",
                            i, points[i].x(), points[i].y(), j, points[j].x(), points[j].y());
                }
            }
        }
        return min;
    }

    private static void DrawPoints(Point2D[] points, int width, int height) {
        StdDraw.setCanvasSize(width, height);
        StdDraw.setPenRadius(0.005);
        StdDraw.setPenColor(Color.red);
        StdDraw.setXscale(0, width);
        StdDraw.setYscale(0, height);

        for (Point2D point : points) {
            StdDraw.point(point.x(), point.y());
        }
    }

    private static void CreatePoints(Point2D[] points, int count, int xScale, int yScale) {
        for (int i = 0; i < count; i++) {
            double x = xScale * StdRandom.uniform();
            double y = yScale * StdRandom.uniform();

            points[i] = new Point2D(x, y);
        }
    }

    public static void main(String[] args) {
        int count = Integer.parseInt(args[0]);
        Point2D[] points = new Point2D[count];

        int width = 500;
        int height = 500;

        CreatePoints(points, count, width, height);

        DrawPoints(points, width, height);

        StdOut.printf("The distance between the closest pair of points is %.3f\n", GetMinDistance(points));
    }

}
