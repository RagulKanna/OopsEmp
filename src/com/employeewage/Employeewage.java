package com.employeewage;

class Employee {

    public void EmployeePresentorAbesnt() {
        int check = (int) (Math.random() * 2);
        System.out.println("\n\n Check the employee present or absent:");

        if (check == 1)
            System.out.println("\nemployee is present today");
        else
            System.out.println("\nemployee is absent today");
    }
}

public class Employeewage {
        public static void main (String[] args){
            Employee emp = new Employee();
            emp.EmployeePresentorAbesnt();
        }
    }

