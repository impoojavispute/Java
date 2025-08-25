package Array;
import java.util.Scanner;

public class _6_ArrayReverse 
{
    public static void main (String a[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n= sc.nextInt();

        System.out.println("Enter " + n + " Elements ");
        int arr[]= new int[n];

        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array in reverse order:");

        for (int i=n-1; i>=0; i--)
        {
            System.out.print(arr[i] + " ");
        }

        sc.close();

    }    
}
