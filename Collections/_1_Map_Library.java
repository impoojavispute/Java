package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _1_Map_Library 
{

    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);    
        
        int choice = 0;

        Map<String, Double> Library = new HashMap<>();   
      
       
        
        do
        {
            System.out.println(" ");
            System.out.println("----- Library -----");            
            System.out.println("1. Add Book. ");
            System.out.println("2. Order Book.");
            System.out.println("3. Exit.");
            System.out.println("  ");
            System.out.println("Enter Your Choice. ");
            choice = sc.nextInt();
            sc.nextLine();

        
            switch (choice) 
            {
                case 1: 
                    System.out.println("  ");
                    //System.out.println("Add Book. ");
                    System.out.println("Enter Book Name. ");
                    String bookname = sc.nextLine();


                    System.out.println("Enter Book Price. ");
                    Double price = sc.nextDouble();
                    sc.nextLine();

                    Library.put(bookname, price);
                    System.out.println(" ");
                    System.out.println("Book Added Successfully!");
                    break;

                case 2 :
                    if (Library.isEmpty()) 
                    {
                            System.out.println("No books available. Please add books first.");
                        
                    } 
                    else 
                    {
                            System.out.print("Enter book name to order: ");
                            String orderBook = sc.nextLine();

                            if (Library.containsKey(orderBook)) 
                            {
                                System.out.println("The price of " + orderBook + " is: " + Library.get(orderBook));
                            } 
                            else 
                            {
                                System.out.println("Sorry, " + orderBook + " is not available.");
                            }
                    }
                        
                break;

                default:
                    break;
            }

        }
        while(choice != 3);
        System.out.println("Exiting... Thank you!");
       
        sc.close();
        
    }
}
