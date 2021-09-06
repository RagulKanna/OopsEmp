package com.employeewage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmpWageBuilder implements Employeedetails {


    public static Scanner sc =new Scanner(System.in);
    ArrayList<Multiplecompany> companies=new ArrayList<Multiplecompany>();
    public static Map<String,Multiplecompany> listmultiplecompany =new HashMap<String,Multiplecompany>();
    public static int fdays=1,pdays=1, wage=0,fullmonthlyhr=0,partmonthlyhr=0;
    public static void main(String[] args) {

        EmpWageBuilder empwagebuider =new EmpWageBuilder();
        empwagebuider.addMultiplecompanies("Hp",50,21,110);
        empwagebuider.addMultiplecompanies("Dell",30,25,150);
        empwagebuider.fullcomputewage();
        empwagebuider.partcomputewage();
        System.out.println("\n\nMap:"+listmultiplecompany);

    }

    public void addMultiplecompanies(String companyname,int wageperhour,int noofworkingdays,int workinghourspermonth)
    {
        Multiplecompany multiplecompany=new Multiplecompany(companyname,wageperhour,noofworkingdays,workinghourspermonth);
        companies.add(multiplecompany);
    }

    public static int fcomputewage(Multiplecompany multiplecompany) {
        int totalfullwage = 0;

        System.out.println("\n\n Fulltime employee");
        while (fdays <= multiplecompany.getNoofworkingdays() && fullmonthlyhr < multiplecompany.getWorkinghourspermonth()) {


            System.out.println("\nDAY " + fdays);
            int check = (int) ((Math.random() * 10) % 2);
            if (check == 1) {

                wage = multiplecompany.getWageperhour() * fempperdayhrs;
                fullmonthlyhr = fullmonthlyhr + fempperdayhrs;
                totalfullwage = totalfullwage + wage;
            } else {
                System.out.println("\n Employee absent");
            }
            fdays++;

        }
        System.out.println("\n\nEmployee worked for " + fullmonthlyhr + "hrs");
    return totalfullwage;
    }

        public static int pcomputewage(Multiplecompany multiplecompany) {
            int totalfullwage = 0;
        System.out.println("\n\n Parttime employee");
        int totalpartwage = 0;
        int partmonthhr=(multiplecompany.getWorkinghourspermonth()) / 2;

        while (pdays < multiplecompany.getNoofworkingdays() && partmonthlyhr < partmonthhr) {


            System.out.println("\nDAY " + pdays);
            int check = (int) ((Math.random() * 10) % 2);
            if (check == 1) {

                wage = multiplecompany.getWageperhour() * pempperdayhrs;
                partmonthlyhr=partmonthlyhr+pempperdayhrs;
                totalpartwage = totalpartwage + wage;
                System.out.println("\n Employee present");
            } else {
                System.out.println("\n Employee absent");
            }
            pdays++;
        }
        System.out.println("\n\nEmployee worked for "+partmonthlyhr+"hrs");

        return totalpartwage;
    }


    public void fullcomputewage() {
        for (int i = 0; i < companies.size(); i++) {
            int totalfWage = EmpWageBuilder.fcomputewage(companies.get(i));
            companies.get(i).setFulltotalwage(totalfWage);
            listmultiplecompany.put(companies.get(i).getCompanyname(), companies.get(i));
        }
    }
            public void partcomputewage() {
                for (int i = 0; i < companies.size(); i++) {
            int totalpWage = EmpWageBuilder.pcomputewage(companies.get(i));
            companies.get(i).setParttotalwage(totalpWage);
            listmultiplecompany.put(companies.get(i).getCompanyname(),companies.get(i));
        }
    }


}
