import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Ex1_3_02<Item> implements Iterable<Item> {

    //Stack implemented by linked list
    private Node first;
    private int N;

    private class Node {
        Item item;
        Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return N;
    }

    public void push(Item item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        N++;

        /*Node newFirst = new Node();
        newFirst.item = item;
        newFirst.next = first;
        first = newFirst;*/
    }

    public Item pop() {
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }

    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item> {
        private Node current = first;

        public boolean hasNext() {
            return current != null;
        }

        public void remove() {
        }

        public Item next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No element in stack!");
            }

            Item item = current.item;
            current = current.next;
            return item;
        }
    }

    public static void main(String[] args) {
        Ex1_3_02<String> stackOfString = new Ex1_3_02<>();

        String[] input = {"it", "was", "-", "the", "best", "-", "of", "times",
                "-", "-", "-", "it", "was", "-", "the", "-", "-"};

        for (String s : input) {
            if (!s.equals("-")) {
                stackOfString.push(s);
            } else {
                if (!stackOfString.isEmpty()) {
                    StdOut.printf(stackOfString.pop() + " ");
                }
            }
        }
        StdOut.println("(" + stackOfString.size() + " left on the stack)");
    }

}
