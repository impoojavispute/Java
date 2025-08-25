package Array;
import java.util.Scanner;

public class ArrayCinemaBooking 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter row and Column : ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int matrix[][]= new int[m][n];

        System.out.println("Enter Seat Layout : ");
        for(int i=0; i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
       

        int row = 0;
        int column = 0;
        do
        {
            System.out.println("Enter seat to book (row and column) : ");
            row = sc.nextInt();
            column = sc.nextInt();

            if((row == -1 && column == -1))
            {
                System.out.println("Exit loop");
            }
            

            else
            {
                if(matrix[row][column]==0)
            {
              matrix[row][column] = 1; 
              System.out.println("Seat Booked");

            }
            else
            {
                System.out.println("Seat Not Available ");
            }

            }

            
            System.out.println("Updated Seat Layout:");
            for (int i = 0; i < m; i++) 
            {
                for (int j = 0; j < n; j++) 
                {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

        }

        while (!(row == -1 && column == -1));
        
        sc.close();
    }    
}
