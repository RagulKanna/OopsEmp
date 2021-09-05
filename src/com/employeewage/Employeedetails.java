package com.employeewage;

public interface Employeedetails {
    int checkfullhours = (int) (Math.floor(Math.random() * 8 % 9) + 1);
    int checkparthours = (int) (Math.floor(Math.random() * 4 % 5) + 1);
    int WAGE_PER_HOUR = 20,FULL_DAY_HOUR = 8,PART_TIME_HOUR=4,MONTHLY_FULLTIME_HOUR=100,MONTHLY_PARTTIME_HOUR=50,FULL_MONTH_DAY=20;
    int check = (int) (Math.random() * 2);

    void employeePresentorAbesnt();
    void dailyemployeewage(int checkhours,int hour);
    void monthlywage(int workingtime);
}
