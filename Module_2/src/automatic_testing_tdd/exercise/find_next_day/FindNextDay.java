package automatic_testing_tdd.exercise.find_next_day;

public class FindNextDay {
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
        boolean isDivideBy100 = year % 100 == 0;
        return isDivideBy400 || (isDivideBy4 && isDivideBy100);
    }

    public static int calculateDaysInMonth(int month, int year) {
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> isLeapYear(year) ? 29 : 28;
            default -> 0;
        };
    }
}
