import edu.princeton.cs.algs4.StdOut;

import java.util.Stack;

public class Ex1_3_09 {

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

    private static void displayStacks(Stack<Integer> nums, Stack<String> ops) {
        StdOut.printf("numbers:   ");
        for (Integer i : nums) {
            StdOut.printf(i + " ");
        }
        StdOut.println();
        StdOut.printf("operators: ");
        for (String op : ops) {
            StdOut.printf(op + " ");
        }
        StdOut.printf("\n\n");
    }

    private static void calculate(Stack<Integer> numbers, Stack<String> operators, String[] input) {
        for (String s : input) {
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                operators.push(s);
            } else if (s.equals(")")) {
                int b = numbers.pop();
                int a = numbers.pop();
                String operator = operators.pop();
                numbers.push(arithmetic(a, b, operator));
            } else {
                numbers.push(tryParseInt(s));
            }
        }
        StdOut.println("Answer: " + numbers.peek() + " ");
    }

    private static void displayFullExpression(Stack<String> operands, Stack<String> operators, String[] input) {
        for (String s : input) {
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                operators.push(s);
            } else if (s.equals(")")) {
                String b = operands.pop();
                String a = operands.pop();
                String operator = operators.pop();

                String subExpression = "(" + " " + a + " " + operator + " " + b + " )";
                operands.push(subExpression);
            } else {
                operands.push(s);
            }
        }

        for (String s : operands) {
            StdOut.printf(s + " ");
        }
        StdOut.println();
    }

    public static void main(String[] args) {
        String[] input = {"1", "+", "2", ")", "*", "3", "-", "4", ")",
                "*", "5", "-", "6", ")", ")", ")"};
        Stack<Integer> numbers = new Stack<>();
        Stack<String> operands = new Stack<>();
        Stack<String> operators = new Stack<>();

        displayFullExpression(operands, operators, input);
        calculate(numbers, operators, input);
    }

}
