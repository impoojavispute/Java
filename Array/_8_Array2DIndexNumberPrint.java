package Array;
import java.util.Scanner;

public class _8_Array2DIndexNumberPrint 
{
        public static void main(String a[])
        {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Row Size :");
            int m = sc.nextInt();
            System.out.print("Enter Column Size : ");
            int n = sc.nextInt();

            System.out.println("Row and Column Index are : ");
            for(int i=0;i<m;i++)
            {
                for (int j=0;j<n;j++)
                {
                    System.out.print(("(" + i + "," + j + ")"));
                }
                System.out.println();
            }

            sc.close();

        }
}
