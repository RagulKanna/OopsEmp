package com.employeewage;

import java.util.Scanner;




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

