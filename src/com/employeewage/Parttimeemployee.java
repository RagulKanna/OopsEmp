package com.employeewage;

class Parttimeemployee extends Employee
{

    public void employee()
    {
        System.out.println("\n\n   For Parttime Employee");
        this.employeePresentorAbesnt();
        this.dailyemployeewage(checkparthours,PART_TIME_HOUR);
        this.monthlywage(MONTHLY_PARTTIME_HOUR);
    }

}
