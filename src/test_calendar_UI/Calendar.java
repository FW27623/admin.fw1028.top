package test_calendar_UI;

/**
 * @author FangWei
 */
public class Calendar {
    String[] day;
    int year=2021,month=11;
    public void setYear(int year)
    {
        this.year=year;
    }

    public int getYear()
    {
        return year;
    }

    public void setMonth(int month)
    {
        this.month=month;
    }

    public int getMonth()
    {
        return month;
    }

    public String[] getCalendar()
    {
        String[] a =new String[42];
        java.util.Calendar date= java.util.Calendar.getInstance();
        date.set(year,month-1,1);
        int week=date.get(java.util.Calendar.DAY_OF_WEEK)-1;
        int day=0;

        if(month==1||month==3||month==5||month==7
                ||month==8||month==10||month==12)
        {
            day=31;
        }

        if(month==4||month==6||month==9||month==11)
        {
            day=30;
        }


        if(month==2)
        {
            if(((year%4==0)&&(year%100!=0))||(year%400==0))
            {
                day=29;
            }

            else
            {
                day=28;
            }
        }

        for(int i=week,n=1;i<week+day;i++)
        {
            a[i]=String.valueOf(n) ;
            n++;
        }
        return a;
    }
}
