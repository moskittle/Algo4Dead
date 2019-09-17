import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;

public class Ex1_3_11 {

    private static int arithmetic(int a, int b, String operator) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                throw new UnsupportedOperationException();
        }
    }

    private static Integer tryParseInt(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException error) {
            StdOut.println("Invalid input for number!");
            return null;
        }
    }

    private static void evaluate(String[] input) {
        Stack<Integer> operands = new Stack<>();

        for (String s : input) {
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                int b = operands.pop();
                int a = operands.pop();
                operands.push(arithmetic(a, b, s));
            } else {
                operands.push(tryParseInt(s));
            }
        }

        StdOut.println("Answer: " + operands.peek() + " ");
    }

    // Evaluate Postfix
    public static void main(String[] args) {
        String str = "1 2 + 3 4 - 5 6 - * * ";
        String[] input = str.split("\\s");

        evaluate(input);
    }

}
