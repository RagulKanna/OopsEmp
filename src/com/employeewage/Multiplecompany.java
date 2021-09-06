package com.employeewage;

public class Multiplecompany {
    private int wage;
    private int noofworkingdays;
    private int workinghourspermonth;

    Multiplecompany(int wage,int noofworkingdays,int workinghourspermonth)
    {
        this.wage=wage;
        this.noofworkingdays=noofworkingdays;
        this.workinghourspermonth=workinghourspermonth;
    }

    public int getWage(int wage)
    {
        return wage;
    }

    public void setWage()
    {
        this.wage=wage;
    }

    public int getNoofworkingdays(int noofworkingdays)
    {
        return noofworkingdays;
    }

    public void setNoofworkingdays()
    {
        this.noofworkingdays=noofworkingdays;
    }

    public int getWorkinghourspermonth(int workinghourspermonth)
    {
        return noofworkingdays;
    }

    public void setWorkinghourspermonth()
    {
        this.workinghourspermonth=workinghourspermonth;
    }
}
