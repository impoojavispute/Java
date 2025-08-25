import java.util.Scanner;

public class practise 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter Rows: ");
        int row = sc.nextInt();

        System.out.println("Enter Column :");
        int col = sc.nextInt();

        int array[][] = new int[row][col];

        System.out.println("Enter Elements: ");
        for (int i =0 ; i<=row ; i++)
        {
            for (int j= 0; j<=col ; j++)
            {
                array[i][j] = sc.nextInt();
            }
        }

        //sum of each row
        

       

        sc.close();
    }

}
