package Array;
import java.util.Scanner;

public class _10_ArrayDiagonalFill 
{
     public static void main(String[] args) 
     {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Enter Row Size : ");
        int m = sc.nextInt();
        System.out.print("Enter Column Size : ");
        int n = sc.nextInt();

        int matrix[][] = new int [m][n];

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                {
                    matrix[i][j]=1;
                }
                else
                {
                    matrix[i][j]=0;
                }


            }
        }
        
        System.out.println("Matrix Is : ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
               System.out.print(matrix[i][j] + " ");

            }
            System.err.println();
        }


        sc.close();
     }    
}
