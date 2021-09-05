package com.employeewage;

class Fulltimeemployee extends Employee
{

    public void employee()
    {
        System.out.println("\n\n   For Fulltime Employee");
        this.employeePresentorAbesnt();
        this.dailyemployeewage(checkfullhours,FULL_DAY_HOUR);
        this.monthlywage(MONTHLY_FULLTIME_HOUR);
    }

}
