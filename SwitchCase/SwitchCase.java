package SwitchCase;
import java.util.Scanner;

public class SwitchCase 
{
     public static void main (String args[])
    {
       Scanner sc = new Scanner (System.in);

       System.out.println("Enter Number 1");
       int number1 = sc.nextInt();
       System.out.println("Enter Number 2");
       int number2 = sc.nextInt();

       System.out.println("Choose Operation");
       System.out.println("1. Addition");
       System.out.println("2. Substration");
       System.out.println("3. Multiplication");
       System.out.println("4. Division");
       System.out.println("Enter choice :");

       int choice = sc.nextInt();
       int result;
    
       switch (choice) {
        case 1:
        result = number1 + number2;
        System.out.println("Result:  " + result);
        break;
       
        case 2:
        result = number1 - number2;
        System.out.println("Result :  " + result); 
        break;

        case 3:
        result = number1 * number2;
        System.out.println("Result :  " + result); 
        break;

        case 4:
        result = number1 / number2;
        System.out.println("Result :  " + result); 
        break;

        default:
        System.out.println("Enter Valid Operation Number:");
       }
       
       sc.close();
    }   
}

