package Array;
import java.util.Scanner;

public class _9_Array2DCountFill
{
    public static void main(String a[])
        {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Row Size :");
            int m = sc.nextInt();
            System.out.print("Enter Column Size : ");
            int n = sc.nextInt();

            
            int num=0;
            int matrix[][] = new int[m][n];
            for(int i=0;i<m;i++)
            {
                for (int j=0;j<n;j++)
                {
                   
                    matrix[i][j]= num = num + 1;
                }
            
            }

             System.out.println("Matrix Is : ");
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
