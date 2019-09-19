import edu.princeton.cs.algs4.ThreeSum;
import edu.princeton.cs.algs4.*;

public class Ex1_4_03 {
    private static int width = 500;
    private static int height = 500;
    private static int xScale = 50;
    private static int yScale = 5;
    private static int size = 0;
    private static double time = 0.0;

    private static Queue<Point2D> standardPoints = new Queue<>();
    private static Queue<Point2D> log2LogPoints = new Queue<>();

    public static double timerTrial(int size) {
        int MAX = 10000;
        int[] a = new int[size];

        for (int i = 0; i < size; i++) {
            a[i] = StdRandom.uniform(-MAX, MAX);
        }
        Stopwatch timer = new Stopwatch();
        ThreeSum.count(a);

        return timer.elapsedTime();
    }

    public static Queue<Point2D> getPoints() {
        Queue<Point2D> points = new Queue<>();

        for (size = 50; size < 4000.0; size += size) {
            time = timerTrial(size);

            points.enqueue(new Point2D(size, time));
            StdOut.println("size: " + size + " timer " + time);
        }
        return points;
    }

    public static Queue<Point2D> standardConverter(Queue<Point2D> points) {
        Queue<Point2D> standardPoints = new Queue<>();
        for (Point2D point : points) {
            standardPoints.enqueue(new Point2D(point.x() / xScale * width, point.y() / yScale * height));
        }
        return standardPoints;
    }

    public static Queue<Point2D> log2LogConverter(Queue<Point2D> points) {
        Queue<Point2D> log2LogPoints = new Queue<>();
        for (Point2D point : points) {
            log2LogPoints.enqueue(new Point2D(Math.log(point.x()) / xScale * width, Math.log(point.y()) / yScale * height));
        }
        return log2LogPoints;
    }

    public static void draw(Queue<Point2D> points) {
        StdDraw.setCanvasSize(width, height);
        StdDraw.setXscale(0, xScale);
        StdDraw.setYscale(0, yScale);
        StdDraw.setPenRadius(0.005);

        for (Point2D point : points) {
            rescaleCanvas(points);
            StdDraw.point(point.x(), point.y());
        }
    }

    public static void rescaleCanvas(Queue<Point2D> points) {
        if (size > xScale) {
            xScale *= 2;
        }

        if (time > yScale) {
            yScale *= 2;
        }

        StdDraw.clear();
        StdDraw.setXscale(0, xScale);
        StdDraw.setYscale(0, yScale);

        for (Point2D point : points) {
            StdDraw.point(point.x(), point.y());
        }

    }


    public static void main(String[] args) {
        Queue<Point2D> points = getPoints();
        standardPoints = standardConverter(points);
        //log2LogPoints = log2LogConverter(points);
        draw(standardPoints);
    }

}
