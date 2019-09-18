import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Ex1_3_21<Item> implements Iterable<Item> {

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

    public boolean find(Item key) {
        boolean result = false;

        Node current = first;
        while (current != null) {
            if (current.item.equals(key)) {
                result = true;
                break;
            }
            current = current.next;
        }
        return result;
    }

    public Iterator<Item> iterator() {
        return new ListIterator();
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

        Ex1_3_21<String> queue = new Ex1_3_21<>();

        for (String s : input) {
            queue.enqueue(s);
        }

        for (String ele : queue) {
            StdOut.printf(ele + " ");
        }

        StdOut.println();

        String key = "answer";
        String question = "question";

        StdOut.println(key + " is in queue: " + queue.find(key));
        StdOut.println(question + " is in queue: " + queue.find(question));
    }

}
