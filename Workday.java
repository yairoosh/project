package com.company;

import java.util.Date;

public class Workday {
    private Date date;
    private Time start;
    private Time end;


public Workday(Date date) {
     this.date = date;
     start = new Time(9, 00);
     end = new Time(17, 00);
    }


    public Date getDate() {
        return date;
    }
    public Time getStart() {
        return start;
    }
    public Time getEnd() {
        return end;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public void setStart(Time start) {
        this.start = start;
    }
    public void setEnd(Time end) {
        this.end = end;
    }


public double workTime() {
Time time = new Time(end.hour- start.hour, end.minute- start.minute);
    return time.inHours();
    }


public boolean isExtra() {
    if(workTime()<8)
        {return false;}
    else
        {return true;}
    }

}
