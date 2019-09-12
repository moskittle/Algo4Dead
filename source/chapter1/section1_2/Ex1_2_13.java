import edu.princeton.cs.algs4.Date;
import edu.princeton.cs.algs4.StdOut;

public class Ex1_2_13 {

    private final String name;
    private final Date date;
    private final double amount;

    private Ex1_2_13(String _name, Date _date, double _amount) {
        name = _name;
        date = _date;
        amount = _amount;
    }

    public String name() {
        return name;
    }

    public Date date() {
        return date;
    }

    public double amount() {
        return amount;
    }

    public String toString() {
        return name + " " + date + " " + amount;
    }

    public boolean equals(Object x) {
        if (this == x) {
            return true;
        }

        if (x == null) {
            return false;
        }

        if (this.getClass() != x.getClass()) {
            return false;
        }

        Ex1_2_13 that = (Ex1_2_13) x;
        if (this.name != that.name || this.date != that.date || this.amount != that.amount) {
            return false;
        }

        return true;
    }

    // transaction
    public static void main(String[] args) {
        Date today = new Date(9, 12, 2019);

        Ex1_2_13 transaction = new Ex1_2_13("Moss Kittle", today, 17.47);
        Ex1_2_13 transaction1 = new Ex1_2_13("Moss Randy", today, 17.47);
        Ex1_2_13 transaction0 = new Ex1_2_13("Moss Kittle", today, 17.47);

        StdOut.println(transaction);
        StdOut.println(transaction.equals(transaction1));
        StdOut.println(transaction.equals(transaction0));
    }

}
