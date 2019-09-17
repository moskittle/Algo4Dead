import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;

public class Ex1_3_10 {

    private static void displayStack(Stack<String> stack) {
        for (String s : stack) {
            StdOut.printf(s + " ");
        }
        StdOut.println();
    }

    // Infix to Postfix
    private static void InfixToPostfix(String[] input) {
        Stack<String> operands = new Stack<>();
        Stack<String> operators = new Stack<>();

        for (String s : input) {
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                operators.push(s);
            } else if (s.equals("(")) {
                // ignore
            } else if (s.equals(")")) {
                String b = operands.pop();
                String a = operands.pop();
                String operator = operators.pop();

                String subExpression = a + " " + b + " " + operator;
                operands.push(subExpression);
            } else {
                operands.push(s);
            }
        }

        displayStack(operands);
    }

    public static void main(String[] args) {
        String str = "( ( 1 + 2 ) * ( ( 3 - 4 ) * ( 5 - 6 ) ) ) ";
        String[] input = str.split("\\s");

        InfixToPostfix(input);
        // output: 1 2 + 3 4 - 5 6 - * *
    }

}
