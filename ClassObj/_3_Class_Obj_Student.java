package ClassObj;
import java.util.Scanner;

public class _3_Class_Obj_Student {
    public static void main(String[] args) {
        String[] names = new String[10];
        int[] marks = new int[10];

        Scanner sc = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("\nChoose Operation");
            System.out.println("1. New Entry");
            System.out.println("2. Update Entry");
            System.out.println("3. Exit");

            choice = sc.nextInt();
            int rollno;

            switch (choice) 
            {
                case 1:
                    System.out.print("Enter roll no (1-10): ");
                    rollno = sc.nextInt();
                    sc.nextLine(); // Consume newline

                    if (rollno < 1 || rollno > 10) {
                        System.out.println("Invalid roll number.");
                        break;
                    }

                    System.out.println("Enter Name: ");
                    String name = sc.nextLine();
                    
                    names[rollno - 1] = name;
                    System.out.println("Student added.");
                    break;

                case 2:
                    System.out.print("Enter roll no (1-10): ");
                    rollno = sc.nextInt();
                    sc.nextLine(); // Consume newline

                    if (rollno < 1 || rollno > 10 || names[rollno - 1] == null) 
                    {
                        System.out.println("Invalid roll number or student not found.");
                        break;
                    }

                    System.out.print("Enter marks: ");
                    marks[rollno - 1] = sc.nextInt();
                    System.out.println("Marks updated.");
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 3);

        sc.close();
    }
}
