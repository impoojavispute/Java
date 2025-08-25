package ClassObj;

import java.util.Scanner;

class FoodItem
{
    int id;
    String name;
    double price; 

     
    void printInfo()
    {
        System.out.println(id + ". " + name + " -" + " ₹" + price); 
        System.out.println("      " ); 
    }
}

class Menu
{
    FoodItem[] foodItems = new FoodItem[30];
    Scanner sc = new Scanner(System.in);
    int count = 0;



    void fullMenu()
    {
        System.out.println("--- Menu Items ---"); 
        System.out.println("1. Pizza");
        System.out.println("2. Burger");
        System.out.println("3. Coke");
        System.out.println("4. Fries");
        System.out.println("      ");

    }


    void addItem()
    {
        FoodItem items = new FoodItem();

        System.out.println("Enter Item Name: ");
        items.name = sc.nextLine();

        System.out.println("Enter Item Price: ");
        items.price = sc.nextInt();
        sc.nextLine();

        System.out.println("Item Added.");
        System.out.println("      " ); 


        foodItems[count] = items;
        count++;


    }

    void removeItem()
    {
        System.out.println("Enter name to remove item: ");
        int removeName = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < count ; i--)
        {
            if(foodItems[i].id == removeName)
            {
                foodItems[i]= null;
                System.out.println("Item Removed.");
                System.out.println("      " ); 

                break;
            } 
        }


    }

    void updateOrder()
    {

        System.out.println("Enter Name of item to update: ");
        // sc.nextLine();
        String updateName = sc.nextLine();
        System.out.print(updateName);

        for (int i = 0; i < count; i++) 
        {
            System.out.print(foodItems[i].name);
            if (foodItems[i].name.equals(updateName)) 
            {
                System.out.println("Enter new Item: ");
                foodItems[i].name = sc.nextLine();
                System.out.println("Item updated successfully.");
                System.out.println("      " ); 

                break;

            }
        }   


    }

    void printOrder()
    {
        
        if (count == 0 )
        {
            System.out.println("No Item. ");

        }
        else
        {
            System.out.println("Order is: ");
            for (int i = 0 ; i < count ; i++)
            {
                if(foodItems[i] != null)
                {
                            
                    foodItems[i].printInfo();
                    System.out.println("-----------------");
                } 
            }
        }           
    }
}    



public class _6_Food_Ordering_System 
{
    public static void main(String[] args) 
    {
        Menu menu = new Menu();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do
        {

            System.out.println("Food Ordering System: ");
            System.out.println("1. Menu");
            System.out.println("2. Add Item.");
            System.out.println("3. Remove Item.");
            System.out.println("4. Update Menu");
            System.out.println("5. View Order");
            System.out.println("6. Exit. ");
            System.out.println("      " ); 


            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            System.out.println("      " ); 

            switch (choice) 
            {
                case 1:
                    menu.fullMenu();
                    break;

                case 2:
                    menu.addItem();
                    break;

                case 3 :
                    menu.removeItem();
                    break;

                case 4:
                    menu.updateOrder();
                    break;
                
                case 5:
                    menu.printOrder();
                    break;
            
                default:
                    break;
            }

        }

        while(choice != 6);
        sc.close();

      




    

        
    }

}
