package Array;
//import java.lang.reflect.Array;
import java.util.Scanner;

public class _4_Array2dSum 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter row :");
        int m = sc.nextInt();

        System.out.println("Enter Column :");
        int n = sc.nextInt();

        int arr[][] = new int[m][n];

        System.out.println("Enter Elements : ");
        
       for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                arr[i][j] = sc.nextInt();
                
            }
            
        }


       
        
        for (int i = 0; i < m; i++) 
        {
            int sum=0;
            for (int j = 0; j < n; j++) 
            {
               
                 sum = sum + arr[i][j];
                 

            }
            System.out.println("Sum of row " + (i + 1) + ": " + sum);

        }
         
        
        

        sc.close();




        



        
    }
}
