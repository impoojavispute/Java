package ClassObj;

import java.util.Scanner;

class Student 
{
    String name;
    int id;
    int marks;

    void printInfo()
    {
        System.out.println("Name : " + name + "Id : " + id + "Marks: " + marks);
    }
}

class Classroom 
{

    Student[] students = new Student[100];
    Scanner sc = new Scanner(System.in);
    int count = 0;



   
    void addStudent()
    {
        Student s = new Student();

        System.out.println("Enter student name: ");
        s.name = sc.nextLine();

        System.out.println("Enter Id: ");
        s.id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Marks: ");
        s.marks = sc.nextInt();
        sc.nextLine();

        students[count] = s;
        count++;

    }

    void printAllStudent()
    {

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


    }

    void removeStudent()
    {
        System.out.println("Enter ID to remove: ");
        int removeID = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < count ; i++)
        {
            if(students[i].id == removeID)
            {
                students[i]= null;
                System.out.println("Student Removed.");
                break;
            } 
        }


    }



}

public class _9_students_system2 
{ 

    public static void main(String[] args)
    {
        
        Classroom classroom = new Classroom();
        int choice = 0;

        Scanner sc = new Scanner(System.in);


        do
        {

            System.out.println("Students System. ");
            System.out.println("1. Add Student. ");
            System.out.println("2. Print Students. ");
            System.out.println("3. Remove Student. ");
            System.out.println("4. Exit. ");

            System.out.println("Enter choice: ");
            choice = sc.nextInt();
            switch (choice) 
            {
                case 1:
                    classroom.addStudent();
                    break;

                case 2 :
                     classroom.printAllStudent();
                     break;

                case 3:

                    classroom.removeStudent();
                    break;

            
                default:
                    break;
            }



        }
        while(choice != 4);
        sc.close();
        
    }
    
}
