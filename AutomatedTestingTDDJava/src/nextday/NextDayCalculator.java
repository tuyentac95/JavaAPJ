package nextday;

public class NextDayCalculator {
    public static String findNextDay(int day, int month, int year) {
        int dayOfMonth;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayOfMonth = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayOfMonth = 30;
                break;
            case 2:
                if (isLeapYear(year)) {
                    dayOfMonth = 29;
                } else {
                    dayOfMonth = 28;
                }
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + month);
        }

        day++;
        if (day > dayOfMonth) {
            day = 1;
            month++;
        }

        if (month > 12) {
            month = 1;
            year++;
        }

        String convert_day = String.valueOf(day);
        if (convert_day.length() == 1) convert_day = "0" + convert_day;

        String convert_month = String.valueOf(month);
        if (convert_month.length() == 1) convert_month = "0" + convert_month;
        return convert_day + "/" + convert_month + "/" + year;
    }

    public static boolean isLeapYear(int year) {
        boolean isYearDivisibleBy400 = year % 400 == 0;
        boolean isYearDivisibleBy100 = year % 100 == 0;
        boolean isYearDivisibleBy4 = year % 4 == 0;

        if (isYearDivisibleBy400) return true;
        else {
            if (isYearDivisibleBy100) return false;
            else {
                return isYearDivisibleBy4;
            }
        }
    }
}
