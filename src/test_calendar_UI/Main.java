package test_calendar_UI;

import javax.swing.JFrame;

/**
 * @author FangWei
 */
public class Main
{
    public static void main(String[] args)
    {
        CalendarUI frame=new CalendarUI();
        frame.setBounds(100,100,360,300);
        frame.setTitle("日历小程序");
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
