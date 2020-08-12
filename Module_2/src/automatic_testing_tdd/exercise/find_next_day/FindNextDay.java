package automatic_testing_tdd.exercise.find_next_day;

public class FindNextDay {
    public static int findNextDay(int days, int month, int year) {
        if (days < 0 || days > 31) {
            return 0;
        } else {
            if (calculateDaysInMonth(month, year) > days) {
                return days + 1;
            }
             else if (days == calculateDaysInMonth(month, year)) {
                return 1;
            }
        }
        return days + 1;
    }

    public static boolean isLeapYear(int year) {
        boolean isDeviceBy400 = year % 400 == 0;
        boolean isDeviceBy4 = year % 4 == 0;
        boolean isDeviceBy100 = year % 100 == 0;
        return isDeviceBy400 || (isDeviceBy4 && isDeviceBy100);
    }

    public static int calculateDaysInMonth(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
        }
        return 0;
    }
}
