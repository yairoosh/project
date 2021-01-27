package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Worker {
    private String name;
    private ArrayList <Workday> workdays;
    private int pay;


public Worker(String name, int pay) {
    this.name = name;
    this.pay = pay;
    workdays = new ArrayList<Workday>();
}


    public String getName() {
        return name;
    }
    public int getPay() {
        return pay;
    }
    public ArrayList<Workday> getWorkdays() {
        return workdays;
    }
    public void setWorkdays(ArrayList<Workday> workdays) {
        this.workdays = workdays;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPay(int pay) {
        this.pay = pay;
    }


    public int workingDays() {return workdays.size();}


    public int Salary() {
        int sum = 0;
        double num1 = 0;
        double num2 = 0;

        for (int i = 0; i < workdays.size(); i++) {
            if (workdays.get(i).workTime() < 8) {
                num1 = workdays.get(i).workTime();
                num2 = 0;
            } else {
                num1 = 8;
                num2 = workdays.get(i).workTime() - 8;
            }
            sum += num1 * getPay();
            sum += num2 * getPay() * 1.25;
        }
        return sum;
    }

public Worker diligent(Worker other) {
    double worker1 = 0;
    double worker2 = 0;

    for (int i = 0; i < this.workdays.size(); i++) {
        worker1 += this.workdays.get(i).workTime();
    }

    for (int i = 0; i <other.workdays.size(); i++){
        worker2 += other.workdays.get(i).workTime();
    }

        if (worker1>worker2)
            {return this;}

        else {return other;}
    }

    public double high(){
    double high8 = 0;
    for (int i = 0; i<workdays.size(); i++){
        if(workdays.get(i).workTime() > 8) {
            high8 += workdays.get(i).workTime() - 8;
        }
    }
    return high8;
    }

}
