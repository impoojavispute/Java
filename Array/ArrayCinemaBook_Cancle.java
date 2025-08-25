package Array;
import java.util.Scanner;

public class ArrayCinemaBook_Cancle 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int seats[][]= new int[5][5];

        int choice = 0;
        int totalSales = 0;

        System.out.println("Welcome To PVR : ");
        System.out.println(" ");

        do
        {
            System.out.println(" ");
            System.out.println("Current Status of Seats is : ");
            
            

            for (int i = 0; i < 5; i++) 
            {
                for (int j = 0; j < 5; j++) 
                {
                    System.out.print(seats[i][j] + " ");
                }
                System.out.println(); 
            }

            System.out.println(" ");
            System.out.println("Choose Operation : ");
            System.out.println("1. Book Seat. ");
            System.out.println("2. Cancel Seat.");
            System.out.println("3. Exit. ");
            System.out.println(" ");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            
            int price = 0;
            int row = 0;
            int col = 0;
            switch (choice) 
            {
                case 1:
                    System.out.println(" ");
                    System.out.println("Choosed Operation Is : " + choice);
                    System.out.println(" ");
                    System.out.print("Enter Seat No to book : ");
                    System.out.println(" ");
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
                        System.out.println("Seat is Booked");

                        }
                        else
                        {
                            System.out.println("Seat Not Available ");
                        }  
                    }

                    if (row < 2)  
                    {
                        price = 100;
                        System.out.println("Ticket Price is : " + price);
                    }  
                    
                    else
                    {
                        price = 200;
                        System.out.println("Ticket Price is  : " + price);
                    }

                    totalSales = totalSales + price;
                    System.out.println(" ");
                    System.out.println("Total Sales " + totalSales);
                    
                    


                    
                    break;

                case 2:
                System.out.println(" ");
                System.out.println("Choosed Operation Is : " + choice);
                System.out.println(" ");
                System.out.println("Enter Seat Row and Column to Cancel: ");
                row = sc.nextInt();
                col = sc.nextInt();

                //System.out.println("Canceled seat number is : " + seats[row][col]);

                if((row == -1 && col == -1))
                    {
                        System.out.println("Exit loop");
                    break;
                    }

                    else
                    {
                        if(seats[row][col]==1)
                        {
                        seats[row][col] = 0; 
                        System.out.println("Seat Cancled");

                        }
                        else
                        {
                            System.out.println("Choose Valide Seat Number ");
                        }  
                    }

                    int priceminus = (row <2 ) ? 100 : 200 ;
                    totalSales = totalSales - priceminus;
                    System.out.println("Total Sales " + totalSales);

                break;
            
                default:
                    break;
            }


            }
            
        while(choice != 3);
        
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
