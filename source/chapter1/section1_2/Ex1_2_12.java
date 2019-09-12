import edu.princeton.cs.algs4.StdOut;

public class Ex1_2_12 {

    private final int month;
    private final int day;
    private final int year;
    private final String dayOfWeek;

    // SmartDate
    public Ex1_2_12(int _month, int _day, int _year) {
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

        dayOfWeek = dayOfWeek();
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

    public String dayOfWeek() {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int gap = 0;
        gap = (year - 2000) * 365;
        for (int i = 0; i < month - 1; i++) {
            gap += daysInMonth[i];
        }
        gap += (day - 1);
        // leap year
        gap += (year - 2000) / 4;
        // 2000 itself is a leap year
        if (gap > 58) {
            gap += 1;
        }
        // 1/1/2000 is Saturday
        return days[(5 + gap) % 7];
    }

    public String toString() {
        return month + "/" + day + "/" + year + '\t' + dayOfWeek;
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

        Ex1_2_12 that = (Ex1_2_12) x;
        if (this.month != that.month || this.day != that.day ||
                this.year != that.year || this.dayOfWeek != that.dayOfWeek) {
            return false;
        }

        return true;
    }

    // Compile with -ea specifier in command line
    // Assumption: This is 21st century
    public static void main(String[] args) {
        Ex1_2_12 date = new Ex1_2_12(2, 28, 2000);
        Ex1_2_12 date1 = new Ex1_2_12(1, 1, 2000);
        Ex1_2_12 date2 = new Ex1_2_12(1, 2, 2000);
        Ex1_2_12 today = new Ex1_2_12(9, 12, 2019);
        Ex1_2_12 date0 = new Ex1_2_12(2, 28, 2000);

        StdOut.println(date);
        StdOut.println(date1);
        StdOut.println(date2);
        StdOut.println(today);
        StdOut.println(date.equals(date0));
        StdOut.println(date.equals(date1));
    }

}
