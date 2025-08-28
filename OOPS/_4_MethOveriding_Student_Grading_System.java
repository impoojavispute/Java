package OOPS;

//Parent Class
class Student 
{
   //methos returns in string thats why datatyepe is string 
   //Use void → if you just want to do an action (like printing).
   //Use a return type (String, int, etc.) → if you want the method to give back some result.

   
   public String  getGrade(int marks)
   {
     //For Normal Students 

     if(marks >= 40 )
     {
        return "PASS";
     }
     else
     {
        return "FAIL";
     }

    
   }
}

//Child Classes
class CollegeStudent extends Student
{
    public String getGrade(int marks)
    {
        if(marks >= 85)
        {
            return "A";
        }
        else if (marks >= 70)
        {
            return "B";
        }
        else if (marks >= 50)
        {
            return "C";
        }
        else
        {
            return "Fail";
        }
    }
}

class SchoolStudent extends Student
{
    public String getGrade(int marks)
    {
        if(marks >= 90)
        {
            return "Excellent";
        }
        else if (marks >= 75)
        {
            return "Very Good";
        }
        else if (marks >= 50)
        {
            return "Good";
        }
        else
        {
            return "Needs Improvement";
        }
    }
}

class UniversityStudent extends Student
{
    public String getGrade(int marks)
    {
        if(marks  >= 95 )
        {
            return "A+";
        }
        else if ( marks >=70)
        {
            return "A";
        }
        else if (marks >= 50 )
        {
            return "B";
        }
        else 
        {
            return "Fail";
        }
    }
} 


public class _4_MethOveriding_Student_Grading_System 
{
    
    public static void main(String[] args) 
    {
        Student s1 = new Student();
        Student s2 = new CollegeStudent();
        Student s3 = new SchoolStudent();
        Student s4 = new UniversityStudent();

        //Take a few marks
        /* This is creating an array of integers in Java.

            int[] means it's an array of integers.

            marksList is the name of the array.

            {95, 72, 40, 30} is the data inside the array — four mark values.

            So, it's just a way to store multiple values (marks) in one variable, instead of writing them one by one.
        */

        int marksList[] = {95 , 72 , 40 , 30 };

        for (int marks : marksList) // for each loop 
        {
                System.out.println("Marks: " + marks);
                System.out.println("Student: " + s1.getGrade(marks));
                System.out.println("College: " + s2.getGrade(marks));
                System.out.println("School: " + s3.getGrade(marks));
                System.out.println("Grade: " + s4.getGrade(marks));
                System.out.println(); 
            
        }

    }
    
}
