package test_calendar_UI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CalendarUI extends JFrame implements ActionListener
{
    JLabel[] labelDay =new JLabel[42];
    JTextField text=new JTextField(10);
    JButton[] titleName =new JButton[7];
    JButton button;
    String[] name ={"日","一","二","三", "四","五","六"};
    JButton nextMonth,previousMonth;
    int year=2021,month=12;
    Calendar calendar;
    JLabel showMessage=new JLabel("",JLabel.CENTER);
    JLabel lbl1 = new JLabel("请输入年份：");
    JLabel lbl2=new JLabel("   ");

    public CalendarUI()
    {
        JPanel pCenter=new JPanel();
        pCenter.setLayout(new GridLayout(7,7));
        for(int i=0;i<7;i++)
        {
            titleName[i]=new JButton(name[i]);
            pCenter.add(titleName[i]);
        }
        for(int i=0;i<42;i++)
        {
            labelDay[i]=new JLabel("",JLabel.CENTER);
            pCenter.add(labelDay[i]);
        }
        text.addActionListener(this);
        calendar=new Calendar();
        calendar.setYear(year);
        calendar.setMonth(month);
        String[] day =calendar.getCalendar();
        for(int i=0;i<42;i++)
        {
            labelDay[i].setText(day[i]);
        }
        nextMonth=new JButton("下月");
        previousMonth=new JButton("上月");
        button=new JButton("确定");
        nextMonth.addActionListener(this);
        previousMonth.addActionListener(this);
        button.addActionListener(this);

        JPanel pNorth=new JPanel(), pSouth=new JPanel();
        pNorth.add(showMessage);
        pNorth.add(lbl2);
        pNorth.add(previousMonth);
        pNorth.add(nextMonth);
        pSouth.add(lbl1);
        pSouth.add(text);
        pSouth.add(button);
        showMessage.setText("日历："+calendar.getYear()+"年"+ calendar.getMonth()+"月" );
        ScrollPane scrollPane=new ScrollPane();
        scrollPane.add(pCenter);
        getContentPane().add(scrollPane,BorderLayout.CENTER);
        getContentPane().add(pNorth,BorderLayout.NORTH);
        getContentPane().add(pSouth,BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==nextMonth)
        {
            month=month+1;
            if(month>12) {
                month=1;
            }
            calendar.setMonth(month);
            String[] day =calendar.getCalendar();

            for(int i=0;i<42;i++)
            {
                labelDay[i].setText(day[i]);
            }
        }
        else if(e.getSource()==previousMonth)
        {
            month=month-1;
            if(month<1) {
                month=12;
            }
            calendar.setMonth(month);
            String[] day =calendar.getCalendar();

            for(int i=0;i<42;i++)
            {
                labelDay[i].setText(day[i]);
            }
        }
        else if(e.getSource()==button)
        {
            month=month+1;
            if(month>12) {
                month=1;
            }
            calendar.setYear(Integer.parseInt(text.getText()));
            String[] day =calendar.getCalendar();
            for(int i=0;i<42;i++)
            {
                labelDay[i].setText(day[i]);
            }
        }
        showMessage.setText("日历："+calendar.getYear()+"年"+calendar.getMonth()+"月" );
    }
}