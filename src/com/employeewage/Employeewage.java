package com.employeewage;

import java.util.Scanner;

class Employee
{

    int checkfullhours = (int) (Math.floor(Math.random() * 8 % 9) + 1);
    int checkparthours = (int) (Math.floor(Math.random() * 4 % 5) + 1);
    public static int WAGE_PER_HOUR = 20,FULL_DAY_HOUR = 8,PART_TIME_HOUR=4,MONTHLY_FULLTIME_HOUR=100,MONTHLY_PARTTIME_HOUR=50;
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

    public void monthlywage(int hours)
    {
        System.out.println("\n\ncheck the employee monthly wage:");
        int monthlysalary=hours*WAGE_PER_HOUR;
        System.out.println("\n  Employee's monthly salary is "+monthlysalary);
    }


}

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


public class Employeewage
{
        public static void main (String[] args)
        {
            Scanner sc =new Scanner(System.in);
            System.out.println("\nenter the employee to check attendance and wage:");
            System.out.println("\n  Enter\n  1 for FullTime Employee\n  2 for PartTime Employee");
            int choice=sc.nextInt();

            Fulltimeemployee fe =new Fulltimeemployee();
            Parttimeemployee pe=new Parttimeemployee();

            switch (choice)
            {
                case 1:
                {
                    fe.employee();
                }
                break;
                case 2:
                {
                    pe.employee();
                }break;
            }
        }
}

