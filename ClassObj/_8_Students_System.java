package ClassObj;

import java.util.Scanner;

class Student
{
    String name;
    int id;
    int marks;

    void printInfo()
    {
        System.out.println("Name : " + name + "ID: " + id + "marks: " + marks);
    }
}



public class _8_Students_System
{

    public static void main(String[] args) 
    {
        Student[] students = new Student[100];
        int count = 0;
        int choice = 0;
        Scanner sc = new Scanner(System.in);


        do
        {
            System.out.println("Students System.");
            System.out.println("1. Add student. ");
            System.out.println("2. Print Information:");
            System.out.println("3. Remove Student.");
            System.out.println("4. Exit.");

            System.out.println("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();


            switch (choice) 
            {
                case 1:
                Student s = new Student();

                System.out.println("Enter name: ");
                s.name = sc.nextLine();

                System.out.println("Enter ID : ");
                s.id = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter Marks: ");
                s.marks = sc.nextInt();
                sc.nextLine();

                System.out.println("Student Added: ");

                students[count] = s;
                count++;
                
                break;

                case 2:
                if (count == 0 )
                {
                    System.out.println("No Student.");

                }
                else
                {
                    System.out.println("Student Information: ");
                    for (int i = 0 ; i < count ; i++)
                    {
                        if(students[i] != null)
                        {
                          
                            students[i].printInfo();
                            System.out.println("-----------------");
                        }
                  

                    }

                }

                break;

                case 3:
                System.out.println("Enter ID to remove: ");
                int removeID = sc.nextInt();
                sc.nextLine();

                for(int i = 0; i < count ; i++)
                {
                        if(students[i].id == removeID)
                        {
                                students[i]= null;
                                System.out.println("Student Removed.");
                        } 
                }
                
                break;
                default:
                    break;
            }

        }
        while(choice != 4);
        sc.close();
    }
    
}
