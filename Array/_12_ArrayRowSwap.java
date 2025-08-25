package Array;
import java.util.Scanner;

public class _12_ArrayRowSwap 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter row size : ");
        int m = sc.nextInt();
        System.out.print("Enter column size : ");
        int n = sc.nextInt();

        int matrix[][] = new int[m][n];

        System.out.println("Enter Elements of Matrix : ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                
                matrix[i][j]= sc.nextInt();
            }
        }

        for (int j = 0; j < n; j++) 
        {
            int temp = matrix[0][j];
            matrix[0][j] = matrix[m-1][j];
            matrix[m-1][j] = temp;
        }

        
        System.out.println("Matrix is :");
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        


        sc.close();
    }
}
