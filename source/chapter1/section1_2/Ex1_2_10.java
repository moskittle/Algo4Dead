import edu.princeton.cs.algs4.StdOut;

public class Ex1_2_10 {

    private int count;
    private int numOperation;
    private final int N;
    private final int max;

    public Ex1_2_10(int _N, int _max) {
        count = 0;
        numOperation = 0;
        N = _N;
        max = _max;
    }

    public int N() {
        return N;
    }

    public int max() {
        return max;
    }

    public int tally() {
        return count;
    }

    public int numOperation() {
        return numOperation;
    }

    public void increment() {
        if (numOperation < N) {
            if (count < Math.abs(max)) {
                count++;
                numOperation++;
            } else {
                StdOut.println("Max count reached!");
            }
        } else {
            StdOut.println("Max number of operations reached!");
        }
    }

    public void decrement() {
        if (numOperation < N) {
            if (count > -Math.abs(max)) {
                count--;
                numOperation++;
            } else {
                StdOut.println("Max count reached!");
            }
        } else {
            StdOut.println("Max number of operations reached!");
        }
    }

    public String toString() {
        return "Count: " + count + "\tCurrent number of operations: " + numOperation + "\n";
    }

    public static void main(String[] args) {
        Ex1_2_10 virtualCounter = new Ex1_2_10(10, 5);

        for (int i = 0; i < 7; i++) {
            virtualCounter.increment();
            StdOut.println(virtualCounter);
        }

        for (int i = 0; i < 6; i++) {
            virtualCounter.decrement();
            StdOut.println(virtualCounter);
        }
    }

}
