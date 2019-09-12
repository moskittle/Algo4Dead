import edu.princeton.cs.algs4.StdOut;

public class Ex1_2_11 {

    private final int month;
    private final int day;
    private final int year;

    // SmartDate
    public Ex1_2_11(int _month, int _day, int _year) {
        month = _month;
        assert 0 <= month && month <= 12 : "Invalid month!";

        year = _year;
        assert 0 <= year : "Invalid year!";

        day = _day;
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            assert 0 <= day && day <= 31 : "Invalid day!";
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            assert 0 <= day && day <= 30 : "Invalid day!";
        } else if (month == 2) {
            if (year % 4 != 0) {
                assert 0 <= day && day <= 28 : "Invalid day!";
            } else if (year % 100 != 0) {
                assert 0 <= day && day <= 29 : "Invalid day!";
            } else if (year % 400 != 0) {
                assert 0 <= day && day <= 28 : "Invalid day!";
            } else {
                assert 0 <= day && day <= 29 : "Invalid day!";
            }
        }
    }

    public int month() {
        return month;
    }

    public int day() {
        return day;
    }

    public int year() {
        return year;
    }

    public String toString() {
        return month + "/" + day + "/" + year;
    }

    // Compile with -ea specifier in command line
    public static void main(String[] args) {
        Ex1_2_11 date = new Ex1_2_11(1, 15, 2019);
        Ex1_2_11 date1 = new Ex1_2_11(2, 29, 2000);
        Ex1_2_11 date2 = new Ex1_2_11(2, 28, 1900);
        //Ex1_2_11 date3 = new Ex1_2_11(2, 29, 1900);

        StdOut.println(date);
        StdOut.println(date1);
        StdOut.println(date2);
        //StdOut.println(date3);
    }

}
