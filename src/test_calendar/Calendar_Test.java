package test_calendar;

import static java.util.Calendar.*;

/**
 * @author FangWei
 */
public class Calendar_Test {
    public static void main(String[] args) {
        System.out.println(getCalendar(2017, 7));
    }

    public static String getCalendar(int year,int month){
        StringBuilder c = new StringBuilder();
        c.append("一\t二\t三\t四\t五\t六\t日\n");
        month -=1;
        java.util.Calendar d = getInstance();
        d.set(year, month, 0);

        int days = 0;
        switch (month) {
            case JANUARY,MARCH,MAY,JULY,AUGUST,OCTOBER,DECEMBER:
                days = 31;
                break;
            case APRIL,JUNE,SEPTEMBER,NOVEMBER:
                days = 30;
                break;
            case FEBRUARY:
                days = 28;
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    days = 29;
                }
                break;
            default:
                System.out.println("输入错误，请重新输入！");
                System.exit(1);
        }
        int week = d.get(DAY_OF_WEEK);
        System.out.println(week);

        c.append("\t".repeat(Math.max(0, week - 1)));
        for (int i = 1; i <= days; i++) {
            c.append(i).append("\t");
            if((week+i-1)%7 == 0){
                c.append("\n");
            }
        }
        return c.toString();
    }
}