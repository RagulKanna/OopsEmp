package com.employeewage;

class Employee
{

    public static int WAGE_PER_HOUR = 20,FULL_DAY_HOUR = 8;
    public static int check = (int) (Math.random() * 2);
    public void employeePresentorAbesnt()
    {

        System.out.println("\n\nCheck the employee present or absent:");

        if (check == 1)
            System.out.println("\n  employee is present today...");
        else
            System.out.println("\n  employee is absent today...");

    }

    public void dailyemployeewage()
    {
        System.out.println("\n\ncheck the employee daily wage:");

        int fullpresent = WAGE_PER_HOUR * FULL_DAY_HOUR;
        System.out.println("\n  if employee worker is present for full day, the salary is " + fullpresent+"...");

        if (check == 1)
        {
            int checkhours = (int) (Math.floor(Math.random() * 8 % 9) + 1);
            int hoursbased = checkhours * WAGE_PER_HOUR;
            System.out.println("\n  employee's salary based on hours, employee present for " + checkhours + " hours so his salary is " + hoursbased+"...");
        }

        else
            System.out.println("\n  the employee's salary is 0, because employee is absent...");

    }
}

public class Employeewage
{
        public static void main (String[] args)
        {
            Employee emp = new Employee();
            emp.employeePresentorAbesnt();
            emp.dailyemployeewage();
        }
}

