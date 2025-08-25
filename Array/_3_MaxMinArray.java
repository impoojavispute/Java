package Array;
import java.util.Scanner;

public class _3_MaxMinArray
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 5 Elements ");
        int n [] = new int[5];

        for (int i = 0; i < 5; i++) 
        {
            n[i] = sc.nextInt();
        }

       // System.out.println(n[]); 
       // want to print make a loop 
        
        int min = n[0];
        int max = n[0];

       

      
    for (int i = 1; i < n.length; i++) 
    {
    if (n[i] < min) 
    {
        min = n[i];
    }

    if (n[i] > max) 
    {
        max = n[i];
    }
}
        
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        sc.close();

            
    }
}

