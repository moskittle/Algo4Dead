import edu.princeton.cs.algs4.StdOut;

public class Ex1_1_21 {

    public static void main(String[] args) {
        String Name = args[0];
        int FieldGoal = Integer.parseInt(args[1]);
        int FieldGoalAttempt = Integer.parseInt(args[2]);

        StdOut.println("Name    FieldGoal   FieldGoalAttempt    FieldGoalPercentage");
        StdOut.printf("%s%13d%19d%23.3f", Name, FieldGoal, FieldGoalAttempt, (double) FieldGoal / FieldGoalAttempt);
    }

}
