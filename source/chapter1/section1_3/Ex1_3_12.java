import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;

public class Ex1_3_12 {

    private static Stack<String> createOriginalStack(String[] input) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < input.length; i++) {
            stack.push(input[input.length - i - 1]);
        }
        return stack;
    }

    private static Stack<String> copy(Stack<String> source) {
        Stack<String> temp = new Stack<>();
        Stack<String> copy = new Stack<>();

        for (String s : source) {
            temp.push(source.pop());
        }

        for (String str : temp) {
            copy.push(temp.pop());
        }

        return copy;
    }

    private static void displayStack(Stack<String> stack) {
        for (String s : stack) {
            StdOut.printf(s + " ");
        }
        StdOut.println();
    }

    public static void main(String[] args) {
        String str = "to be or not to be that is the question";
        String[] input = str.split("\\s");

        Stack<String> source = createOriginalStack(input);
        Stack<String> copy = copy(source);

        displayStack(copy);
    }

}
