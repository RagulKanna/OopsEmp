package com.employeewage;

public class Multiplecompany {
    private String companyname;
    private int wageperhour;
    private int noofworkingdays;
    private int workinghourspermonth;
    private int fulltotalwage;
    private int parttotalwage;

    Multiplecompany(String companyname, int wageperhour, int noofworkingdays, int workinghourspermonth)
    {
        this.companyname=companyname;
        this.wageperhour = wageperhour;
        this.noofworkingdays=noofworkingdays;
        this.workinghourspermonth=workinghourspermonth;

    }

    public String getCompanyname()
    {
        return companyname;
    }

    public void setCompanyname(String companyname)
    {
        this.companyname=companyname;
    }

    public int getWageperhour()
    {
        return wageperhour;
    }

    public void setWageperhour(int wageperhour)
    {
        this.wageperhour = wageperhour;
    }

    public int getNoofworkingdays()
    {
        return noofworkingdays;
    }

    public void setNoofworkingdays(int noofworkingdays)
    {
        this.noofworkingdays=noofworkingdays;
    }

    public int getWorkinghourspermonth()
    {
        return workinghourspermonth;
    }

    public void setWorkinghourspermonth(int workinghourspermonth)
    {
        this.workinghourspermonth=workinghourspermonth;
    }

    public int getFulltotalwage()
    {
        return fulltotalwage;
    }

    public void setFulltotalwage(int totalfullWage)
    {
        this.fulltotalwage=fulltotalwage;
    }

    public int getParttotalwage()
    {
        return parttotalwage;
    }

    public void setParttotalwage(int parttotalwage)
    {
        this.parttotalwage=parttotalwage;
    }




    public String toString()
    {
        return "Multiplecompany{" +
                " companyname = '"+companyname+
                ",wageperhour = "+wageperhour+
                ", noofworkingdays = "+noofworkingdays+
                ", workinghourspermonth = "+workinghourspermonth+
                ", totalwageoffulltimeemployee ="+fulltotalwage+
                ", totalwageofpartimeemployee = " +parttotalwage+
                '}';
    }
}
