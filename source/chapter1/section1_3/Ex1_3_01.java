import edu.princeton.cs.algs4.StdOut;

import java.util.NoSuchElementException;

public class Ex1_3_01 {

    // Fixed capacity stack of string
    private String[] a;
    private int N;

    public Ex1_3_01(int cap) {
        a = new String[cap];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public boolean isFull() {
        return N == a.length;
    }

    public void push(String s) {
        a[N++] = s;
    }

    public String pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack underflow");
        }
        return a[--N];
    }

    public static void main(String[] args) {
        Ex1_3_01 fixedCapacityStackOfString = new Ex1_3_01(5);

        String[] input = {"to", "be", "or", "not", "to", "be"};

        for (int i = 0; !fixedCapacityStackOfString.isFull(); i++) {
            fixedCapacityStackOfString.push(input[i]);
        }

        while (!fixedCapacityStackOfString.isEmpty()) {
            StdOut.println(fixedCapacityStackOfString.pop());
        }
    }

}
