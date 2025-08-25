package Array;
import java.util.Scanner;

public class _11_ArrayBorderElements 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);


       System.out.println("Enter Row Size");
        int m = sc.nextInt();
        System.out.println("Enter Row Size");
        int n = sc.nextInt();

        //int matrix[][]=new int[m][n];

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                //if (i==0 || j==0 || i==n-1 || j==n-1) 
                if (i==0 || i==n-1 || j==0 || j==n-1)
                {
                  System.out.print("1 ");
                  //matrix[i][j]= 1;    
                }

                else
                {
                    System.out.print("0 ");
                    //matrix[i][j]= 0;
                }
            }
            System.out.println();
        }

        /*System.out.println("Matrix is : ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println(matrix[i][j] + " ");
            }
        }

        System.out.println();*/








        sc.close();

    }    
}
