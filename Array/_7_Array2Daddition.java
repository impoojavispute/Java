package Array;
import java.util.Scanner;

public class _7_Array2Daddition 
{
   public static void main(String a[])
   {

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter number of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int n = sc.nextInt();

        int[][] A = new int[m][n];
        int[][] B = new int[m][n];
        int[][] C = new int[m][n];

        
        System.out.println("Enter elements of matrix A:");
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                A[i][j] = sc.nextInt();
            }
        }

        
        System.out.println("Enter elements of matrix B:");
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                B[i][j] = sc.nextInt();
            }
        }

        
        
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

       
        System.out.println("Sum of matrix:");

        for (int i = 0; i < m; i++)
         {
            for (int j = 0; j < n; j++) 
            {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}


   
