import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Ex1_3_04<Item> implements Iterable<Item> {
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
    }

    public static boolean isBalanced(Ex1_3_04<Character> parenthese, char[] a) {
        for (char ch : a) {
            if (ch == '{' || ch == '[' || ch == '(') {
                parenthese.push(ch);
            } else {
                if (parenthese.isEmpty()) {
                    return false;
                }
                if (ch == '}' && parenthese.pop() != '{'
                        || ch == ']' && parenthese.pop() != '['
                        || ch == ')' && parenthese.pop() != '(') {
                    return false;
                }
            }
        }

        return true;
    }

    public Item pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty!");
        }

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
            throw new UnsupportedOperationException();
        }

        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

    public static void main(String[] args) {
        char[] input1 = {'[', '(', ')', ']', '{', '}', '{', '[', '(', ')', '(', ')', ']', '(', ')', '}'};
        char[] input2 = {'[', '(', ']', ')'};
        Ex1_3_04<Character> parenthese = new Ex1_3_04<>();

        StdOut.println("input1 is valid: " + isBalanced(parenthese, input1));
        StdOut.println("input2 is valid: " + isBalanced(parenthese, input2));

    }

}
