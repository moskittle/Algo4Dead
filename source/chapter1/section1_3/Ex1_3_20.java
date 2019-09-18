import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Ex1_3_20<Item> implements Iterable<Item> {

    private Node first;
    private Node last;
    private int size;

    private class Node {
        Item item;
        Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return size;
    }

    public void enqueue(Item item) {
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }
        size++;
    }

    public Item dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Empty queue!");
        }
        Item item = first.item;
        Node oldFirst = first;
        first = first.next;
        oldFirst = null;
        size--;
        return item;
    }

    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    public void delete(int k) {
        if (k < 0 || k > size) {
            throw new IndexOutOfBoundsException();
        }

        if (k == 1) {
            first = first.next;
        } else {
            Node current = first;

            for (int i = 0; i < k - 2; i++) {
                current = current.next;
            }
            Node temp = current.next;
            current.next = current.next.next;
            temp = null;
        }
    }

    private class ListIterator implements Iterator<Item> {
        Node current = first;

        public boolean hasNext() {
            return current != null;
        }

        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

    }


    public static void main(String[] args) {
        String str = "1 2 3 4 5 6 7";
        String[] input = str.split("\\s");

        Ex1_3_20<String> queue = new Ex1_3_20<>();

        for (String s : input) {
            queue.enqueue(s);
        }

        queue.delete(5);

        for (String ele : queue) {
            StdOut.printf(ele + " ");
        }

        StdOut.println();
    }

}
