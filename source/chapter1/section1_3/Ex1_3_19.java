import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Ex1_3_19<Item> implements Iterable<Item> {

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

    public Item removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("Empty queue!");
        }
        Item item = last.item;

        if (size == 1) {
            first = null;
        } else {
            Node temp = first;
            while (temp.next != last) {
                temp = temp.next;
            }
            temp.next = null;
            last = temp;
        }
        return item;
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
        String str = "to be or not to be that is the question";
        String[] input = str.split("\\s");

        Ex1_3_19<String> queue = new Ex1_3_19<>();

        for (String s : input) {
            queue.enqueue(s);
        }

        queue.removeLast();

        for (String ele : queue) {
            StdOut.printf(ele + " ");
        }

        StdOut.println();
    }


}
