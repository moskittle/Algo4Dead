import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Ex1_3_14<Item> implements Iterable<Item> {

    private Item[] a = (Item[]) new Object[1];
    private int size = 0;
    private int first;
    private int last;

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void resize(int max) {
        Item[] temp = (Item[]) new Object[max];

        for (int i = 0; i < size; i++) {
            temp[i] = a[first % a.length + i];
        }
        a = temp;
        first = 0;
        last = size;
    }

    public boolean isFull() {
        return size == a.length;
    }

    public void enqueue(Item item) {
        if (isFull()) {
            resize(a.length * 2);
        }
        if (last == a.length) {
            last = 0;   // wrap around
        }
        a[last++] = item;
        size++;
    }

    public Item dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty!");
        }
        Item item = a[first];
        a[first++] = null;

        if (first == a.length) {
            first = 0;
        }
        size--;

        if (size > 0 && size < a.length / 4) {
            resize(a.length / 2);
        }
        return item;
    }

    public Iterator<Item> iterator() {
        return new ArrayIterator();
    }

    public class ArrayIterator implements Iterator<Item> {
        private int index = first;


        public boolean hasNext() {
            return index < last;
        }

        public Item next() {
            return a[index++];
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

    }


    // Resizing ArrayQueueOfStrings
    public static void main(String[] args) {
        String str = "to be or not to be that is the question";
        //String str = "0 1 2 3 4 5";
        String[] input = str.split("\\s");

        Ex1_3_14<String> queue = new Ex1_3_14<String>();
        queue.enqueue(input[0]);
        queue.enqueue(input[1]);
        queue.enqueue(input[2]);

        queue.dequeue();

        for (String s : queue) {
            StdOut.printf(s + " ");
        }

        StdOut.println();

    }

}
