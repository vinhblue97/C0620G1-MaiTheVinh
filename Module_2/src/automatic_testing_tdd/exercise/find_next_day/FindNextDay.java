package automatic_testing_tdd.exercise.find_next_day;

public class FindNextDay {

    public static final int JANUARY = 1;
    public static final int FEBRUARY = 2;
    public static final int MATH = 3;
    public static final int APRIL = 4;
    public static final int MAY = 5;
    public static final int JUNE = 6;
    public static final int JULY = 7;
    public static final int AUGUST = 8;
    public static final int SEPTEMBER = 9;
    public static final int OCTOBER = 10;
    public static final int NOVEMBER = 11;
    public static final int DECEMBER = 12;

    public static String findNextDay(int days, int month, int year) {
        if (days < 0 || days > 31) {
            return "";
        } else {
            if (calculateDaysInMonth(month, year) > days) {
                return "Ngày: " + (days + 1) + ", tháng: " + month + ", năm: " + year;
            } else if (days == calculateDaysInMonth(month, year)) {
                boolean isEqualTwelve = month == 12;
                if (isEqualTwelve) {
                    return "Ngày: " + 1 + ", tháng: " + 1 + ", năm: " + (year + 1);
                } else {
                    return "Ngày: " + 1 + ", tháng: " + (month + 1) + ", năm: " + year;
                }
            }
        }
        return "Ngày: " + (days + 1) + ", tháng: " + month + ", năm: " + year;
    }

    public static boolean isLeapYear(int year) {
        boolean isDivideBy400 = year % 400 == 0;
        boolean isDivideBy4 = year % 4 == 0;
        boolean isDivideBy100 = year % 100 != 0;
        return isDivideBy400 || (isDivideBy4 && isDivideBy100);
    }

    public static int calculateDaysInMonth(int month, int year) {
        return switch (month) {
            case JANUARY, MATH, MAY, JULY, AUGUST, OCTOBER, DECEMBER -> 31;
            case APRIL, JUNE, SEPTEMBER, NOVEMBER -> 30;
            case FEBRUARY -> isLeapYear(year) ? 29 : 28;
            default -> 0;
        };
    }
}
