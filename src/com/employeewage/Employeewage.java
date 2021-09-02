package com.employeewage;

class Employee
{

    int checkfullhours = (int) (Math.floor(Math.random() * 8 % 9) + 1);
    int checkparthours = (int) (Math.floor(Math.random() * 4 % 5) + 1);
    public static int WAGE_PER_HOUR = 20,FULL_DAY_HOUR = 8,PART_TIME_HOUR=4;
    public static int check = (int) (Math.random() * 2);

    public void employeePresentorAbesnt()
    {

        System.out.println("\n\nCheck the employee present or absent:");

        if (check == 1)
            System.out.println("\n  employee is present today...");
        else
            System.out.println("\n  employee is absent today...");

    }

    public void dailyemployeewage(int checkhours,int hour)
    {
        System.out.println("\n\ncheck the employee daily wage:");

        int fullpresent = WAGE_PER_HOUR * hour;
        System.out.println("\n  if employee worker is present for full day, the salary is " + fullpresent+"...");

        if (check == 1)
        {
            int hoursbased = checkhours * WAGE_PER_HOUR;
            System.out.println("\n  employee's salary based on hours, employee present for " + checkhours + " hours so his salary is " + hoursbased+"...");
        }

        else
            System.out.println("\n  the employee's salary is 0, because employee is absent...");

    }
}

class Fulltimeemployee extends Employee
{

    public void employee()
    {
        System.out.println("\n\n   For Fulltime Employee");
        this.employeePresentorAbesnt();
        this.dailyemployeewage(checkfullhours,FULL_DAY_HOUR);
    }

}

class Parttimeemployee extends Employee
{

    public void employee()
    {
        System.out.println("\n\n   For Parttime Employee");
        this.employeePresentorAbesnt();
        this.dailyemployeewage(checkparthours,PART_TIME_HOUR);
    }

}


public class Employeewage
{
        public static void main (String[] args)
        {
            Fulltimeemployee fe =new Fulltimeemployee();
            fe.employee();
            Parttimeemployee pe=new Parttimeemployee();
            pe.employee();
        }
}

