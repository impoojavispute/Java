package Array;
import java.util.Scanner;

public class _13_Array2DSwitch 
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row Numbers : ");
        int m = sc.nextInt();
        System.out.print("Enter Column Numbers : ");
        int n = sc.nextInt();

        int A[][] = new int [m][n];
        int B[][] = new int [m][n];
        int C[][] = new int [m][n];


        System.out.println("Enter Elements of Matrix A : ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                
                A[i][j]= sc.nextInt();
            }
        }


        System.out.println("Enter Elements of Matrix B : ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                
                B[i][j]= sc.nextInt();
            }
        }

        System.out.println("Enter Choice: ");
        System.out.println("1.Addition ");
        System.out.println("2.Substracion ");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");

        
        int choice = sc.nextInt();
        switch (choice) 
        {
            case 1:

            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                    {
                
                         C[i][j] = A[i][j]+B[i][j];
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
            break;

            case 2:
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                    {
                
                         C[i][j] = A[i][j]-B[i][j];
                    }
             }
             
             System.out.println("Substraction of matrix:");

                for (int i = 0; i < m; i++)
                {
                    for (int j = 0; j < n; j++) 
                        {
                            System.out.print(C[i][j] + " ");
                        }
                        System.out.println();
                }
            break;

            case 3:
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                    {
                
                         C[i][j] = A[i][j]*B[i][j];
                    }
             }
             
             System.out.println("Multiplication of matrix:");

                for (int i = 0; i < m; i++)
                {
                    for (int j = 0; j < n; j++) 
                        {
                            System.out.print(C[i][j] + " ");
                        }
                        System.out.println();
                }
            break;
        
            case 4:
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                    {
                
                         C[i][j] = A[i][j]+B[i][j];
                    }
             }
             
             System.out.println("Division of matrix:");

                for (int i = 0; i < m; i++)
                {
                    for (int j = 0; j < n; j++) 
                        {
                            System.out.print(C[i][j] + " ");
                        }
                        System.out.println();
                }
            break;
            default:
                System.out.println("Enter Valid Operation Number:");
        }

        sc.close();


    }


}
