package Abhi_Book;
import java.util.Scanner;

class Book {

    String name;
    int price;

    void enterName(String userInput) {
        name = userInput;
    }

    void updatePrice(int price) {
        this.price = price;
    }

    void printDetails() {
        System.out.println("Book: " + name + ", Price: " + price);
    }
}

public class Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book[] set = new Book[10];

        // Initialize all book objects
        for (int i = 0; i < set.length; i++) {
            set[i] = new Book();
        }

        System.out.println("Choose Option: 1 for name, 2 for price");
        int option = sc.nextInt();

        int selectedPosition = 0;
        switch (option) {
            case 1:
            selectedPosition = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            if (selectedPosition  == 0)
            {
                selectedPosition =1;
                String temp = sc.nextLine();
                set[selectedPosition].enterName(temp);
                break;
            }
            else
            {
                System.err.println("full");
                selectedPosition++;
            }
                
            case 2:
                selectedPosition = sc.nextInt();
                int price = sc.nextInt();
                set[selectedPosition].updatePrice(price);
                break;
            default:
                System.out.println("Invalid Option");
                break;
        }

        // For testing
        set[0].printDetails();
        sc.close();
    }
}
