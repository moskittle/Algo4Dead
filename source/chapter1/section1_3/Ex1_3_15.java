import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.StdOut;

public class Ex1_3_15 {

    public static void main(String[] args) {
        String str = "to be or not to be that is the question";
        String[] input = str.split("\\s");
        Queue<String> queue = new Queue<>();
        //int k = Integer.parseInt(args[0]);
        int k = 4;
        for (String s : input) {
            queue.enqueue(s);
        }

        if (k > queue.size() || k == 0) {
            throw new IndexOutOfBoundsException();
        }

        int index = 0;
        for (String s : queue) {
            if (index++ == queue.size() - k) {
                StdOut.println(s);
            }
        }
    }

}
