package com.employeewage;

import java.util.Scanner;

class Employee
{

    int checkfullhours = (int) (Math.floor(Math.random() * 8 % 9) + 1);
    int checkparthours = (int) (Math.floor(Math.random() * 4 % 5) + 1);
    public static int WAGE_PER_HOUR = 20,FULL_DAY_HOUR = 8,PART_TIME_HOUR=4,MONTHLY_FULLTIME_HOUR=100,MONTHLY_PARTTIME_HOUR=50,FULL_MONTH_DAY=20;
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

    public void monthlywage(int workingtime)
    {
        int day=1,totalhrs=0,fullworkhrs;
        System.out.println("\n\ncheck the employee monthly wage:");
        int monthlysalary=workingtime*WAGE_PER_HOUR;
        System.out.println("\n  Employee's default monthly salary is "+monthlysalary);
        if(Employeewage.choice == 1)

            while(totalhrs < workingtime && day < FULL_MONTH_DAY+1 )
        {
            fullworkhrs=(int) (Math.floor(Math.random() * 8 % 9) + 1);
            System.out.println("\nDay "+day);
            totalhrs=totalhrs+fullworkhrs;
            System.out.println("employee worked for "+fullworkhrs+" hours");
            day++;
        }
        else
            while(totalhrs < workingtime && day < FULL_MONTH_DAY+1 )
            {
                fullworkhrs=(int) (Math.floor(Math.random() * 4 % 5) + 1);;
                System.out.println("\nDay "+day);
                totalhrs=totalhrs+fullworkhrs;
                System.out.println("employee worked for "+fullworkhrs+" hours");
                day++;
            }



        System.out.println("\n\ncheck the monthly wage with presence of hours:");
        int monthlywage=WAGE_PER_HOUR*totalhrs;
        if(totalhrs>workingtime)
        {
            int extrahrs=totalhrs-workingtime;
            System.out.println("\nEmployee worked for "+extrahrs+" as extratime so that salary also included");
            System.out.println("\n  The monthly wage of employee is "+monthlywage+", employee worked for "+totalhrs+" hours");
        }
        else
            System.out.println("\n  The monthly wage of employee is "+monthlywage+", employee worked for "+totalhrs+" hours");

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
        public static int choice;
        public static void main (String[] args)
        {
            Scanner sc =new Scanner(System.in);
            System.out.println("\n\n              Implemented with class and methods for employee wage");
            System.out.println("\nenter the employee to check attendance and wage:");
            System.out.println("\n  Enter\n  1 for FullTime Employee\n  2 for PartTime Employee");
            choice=sc.nextInt();

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

