package test_calendar;

import javax.swing.*;

/**
 * @author FangWei
 */
public class Calendar {
    public static void main(String[] args) {
        int year = -1;
        int month = -1;
        while (year < 0) {
            try {
                year = Integer.parseInt(JOptionPane.showInputDialog("请输入年份！"));
            } catch (Exception ex) {
                year = Integer.parseInt(JOptionPane.showInputDialog("输入错误,请重新输入年份！"));
            }
        }
        while (month < 0) {
            try {
                month = Integer.parseInt(JOptionPane.showInputDialog("请输入月份！"));
                if (month < 1 || month > 12) {
                    throw new Exception();
                }
            } catch (Exception ex) {
                month = Integer.parseInt(JOptionPane.showInputDialog("输入错误，请重新输入月份！"));
                System.out.println(",请输入月份");
            }
        }
        System.out.println("你输入的年份和月份是："+year+"年"+month+"月\n其对应的日历页如下：");
        System.out.println("一\t二\t三\t四\t五\t六\t日\n");
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(year, month-1, 0);
        int week = calendar.get(java.util.Calendar.DAY_OF_WEEK);
        int monthDays;
        switch (month) {
            case 1:
                if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                    monthDays = 29;
                } else {
                    monthDays = 28;
                }
                break;
            case 2:
                monthDays = 30;
                break;
            default:
                monthDays = 31;
        }
        int weekLoop = 0;
        for (int i = -week + 2; i <= monthDays; i++) {
            if (i <= 0) {
                System.out.print("");
            } else {
                System.out.print(i);
            }
            weekLoop++;
            System.out.print("\t");
            if (weekLoop % 7 == 0) {
                System.out.println();
            }
        }
    }
}
