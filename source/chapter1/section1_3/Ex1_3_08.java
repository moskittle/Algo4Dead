import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Ex1_3_08<Item> implements Iterable<Item> {

    private Item[] a = (Item[]) new Object[1];
    private int size = 0;

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void resize(int max) {
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < size; i++) {
            temp[i] = a[i];
        }
        a = temp;
    }

    public void push(Item item) {
        if (size == a.length) {
            resize(a.length * 2);
        }
        a[size++] = item;
    }

    public Item pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }

        Item item = a[--size];
        a[size] = null;        // avoid dangling reference
        if (size > 0 && size == a.length / 4) {
            resize(a.length / 2);
        }
        return item;
    }

    public Item peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Invalid index!");
        }
        return a[size - 1];
    }

    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }

    public class ReverseArrayIterator implements Iterator<Item> {

        private int index = size;

        public boolean hasNext() {
            return index > 0;
        }

        public Item next() {
            return a[--index];
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

    }

    public static void main(String[] args) {
        String[] input = {"it", "was", "-", "the", "best", "-", "of", "times",
                "-", "-", "-", "it", "was", "-", "the", "-", "-"};
        Ex1_3_08<String> stack = new Ex1_3_08<>();

        for (String s : input) {
            if (!s.equals("-")) {
                stack.push(s);
            } else {
                if (!stack.isEmpty()) {
                    StdOut.printf(stack.pop() + " ");
                }
            }
        }

        StdOut.println();
        StdOut.printf("Contents: ");
        for (String s : stack) {
            StdOut.printf(stack.peek() + " ");
        }
        StdOut.printf(" Size: %d", stack.size());
    }
}
