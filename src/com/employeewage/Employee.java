package com.employeewage;

class Employee implements Employeedetails
{
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
        int day=1,days=0,totalhrs=0,fullworkhrs;
        System.out.println("\n\ncheck the employee monthly wage:");
        int monthlysalary=workingtime*WAGE_PER_HOUR;
        System.out.println("\n  Employee's default monthly salary is "+monthlysalary);
        if(Employeewage.choice == 1)

            while(totalhrs < workingtime && day < FULL_MONTH_DAY+1 )
            {
                int presentornot=(int) ((Math.random() * 10) % 2);
                System.out.println("\nDay "+day);
                if(presentornot == 0) {
                    System.out.println("\nToday absent");
                }
                else if(presentornot == 1) {
                    totalhrs = totalhrs + FULL_DAY_HOUR;
                    System.out.println("\nToday present");
                    days++;
                }

                day++;
            }
        else
            while(totalhrs < workingtime && day < FULL_MONTH_DAY+1 )
            {
                int presentornot=(int) ((Math.random() * 10) % 2);
                System.out.println("\nDay "+day);
                if(presentornot == 0) {
                    System.out.println("\nToday absent");
                }
                if(presentornot == 1) {
                    totalhrs = totalhrs + PART_TIME_HOUR;
                    System.out.println("\nToday present");
                    days++;
                }

                day++;
            }



        System.out.println("\n\ncheck the monthly wage with presence of hours:");
        int monthlywage=WAGE_PER_HOUR*totalhrs;
        if(totalhrs>workingtime)
        {
            int extrahrs=totalhrs-workingtime;
            System.out.println("\nEmployee worked for "+extrahrs+" as extratime so that salary also included");
            System.out.println("\n  The monthly wage of employee is "+monthlywage+", employee worked for "+totalhrs+" hours, which is equal to "+days+" days");
        }
        else
            System.out.println("\n  The monthly wage of employee is "+monthlywage+", employee worked for "+totalhrs+" hours, which is equal to "+days+" days");

    }


}

