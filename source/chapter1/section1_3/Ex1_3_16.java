import edu.princeton.cs.algs4.Date;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.StdOut;

public class Ex1_3_16 {

    public static Date[] readDates(String fileName) {
        In in = new In(fileName);
        Queue<Date> queue = new Queue<>();
        while (!in.isEmpty()) {
            queue.enqueue(new Date(in.readString()));
        }
        int N = queue.size();
        Date[] dates = new Date[N];
        for (int i = 0; i < N; i++) {
            dates[i] = queue.dequeue();
        }

        return dates;
    }

    public static void main(String[] args) {
        Date[] dates = readDates(args[0]);

        for (Date date : dates) {
            StdOut.println(date);
        }
    }

}
