package Array;
import java.util.Scanner;

public class ArrayCinemaBookingSale 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int seats[][]= new int[5][5];

        for (int i = 0; i < 5; i++) 
        {
            for (int j = 0; j < 5; j++) 
            {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println(); 
        }

        int row = 0;
        int col = 0;
        int totalSales = 0; 

       
        do
        {
            

            System.out.println("Enter Seat to book : ");
            row = sc.nextInt();
            col = sc.nextInt();
            
            if((row == -1 && col == -1))
            {
                System.out.println("Exit loop");
                break;
            }

            else
            {
                
                
                if(seats[row][col]==0)
                {
                seats[row][col] = 1; 
                System.out.println("Seat Booked");

                }
                else
                {
                    System.out.println("Seat Not Available ");
                }


            }


            int price = (row < 2) ? 100 : 200;
            totalSales = totalSales + price;
            System.out.println("Total Sales " + totalSales);

            System.out.println("Final seat status:");
            for (int i = 0; i < 5; i++) 
            {
                for (int j = 0; j < 5; j++) 
                {
                     System.out.print(seats[i][j] + " ");
                }
                
                System.out.println();
        }

        
        
        
        }
        
        while (!(row == -1 && col == -1));

        System.out.println("Final Total Sales of the Day: " + totalSales);
        System.out.println("Final Seat Status:");
        for (int i = 0; i < 5; i++) 
        {
            for (int j = 0; j < 5; j++) 
            {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
        




        sc.close();



    }
}
