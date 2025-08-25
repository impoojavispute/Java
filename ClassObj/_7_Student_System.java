package ClassObj;

import java.util.Scanner;

class Student 
{
    String name;
    int id ;
    int marks;

    void printInfo()
    {
        System.out.println("name :" + name);
        System.out.println("Id :" + id);
        System.out.println("Marks : " + marks);
    }
}

public class _7_Student_System
{

    public static void main(String[] args) 
    {

        Student student = new Student();

        Scanner sc = new  Scanner(System.in);
        int choice = 0 ;
        do 
        {
            System.out.println("Student Manage System");
            System.out.println("1. Add student. ");
            System.out.println("2. Print student info.");
            System.out.println("3. Remove student. ");
            System.out.println("4. Exit system.");

            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) 
            {
                case 1:
                                               
                    System.out.println("Enter name : ");
                    student.name = sc.nextLine();
                    System.out.println("Enter ID : ");
                    student.id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter marks");
                    student.marks= sc.nextInt();
                    sc.nextLine();
                    System.out.println("Student added.");

                    break;

                case 2:

                    if (student == null)
                    {
                        System.out.println("No Student");

                    }
                    else
                    {
                        System.out.println("Print info:");
                        student.printInfo();
                    }
                    

                    break;

                case 3 :
                if (student != null) 
                {
                        student = null;
                        System.out.println("Student removed.");
                } 
                else 
                {
                        System.out.println("No student to remove.");
                }
            
                default:
                    break;
            }


        }
        while (choice != 4);
        sc.close();
    }
    
}
