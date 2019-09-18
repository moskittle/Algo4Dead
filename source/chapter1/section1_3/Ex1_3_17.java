import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Transaction;

public class Ex1_3_17 {

    public static Transaction[] readTransaction(String fileName) {
        In in = new In(fileName);
        Queue<Transaction> queue = new Queue<>();

        while (!in.isEmpty()) {
            queue.enqueue(new Transaction(in.readLine()));
        }
        int N = queue.size();
        Transaction[] transactions = new Transaction[N];
        for (int i = 0; i < N; i++) {
            transactions[i] = queue.dequeue();
        }
        return transactions;
    }

    public static void main(String[] args) {
        Transaction[] transactions = readTransaction(args[0]);
        for (Transaction transaction : transactions) {
            StdOut.println(transaction);
        }
    }

}
