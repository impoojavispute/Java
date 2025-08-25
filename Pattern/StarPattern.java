package Pattern;
public class StarPattern 
{
   public static void main(String[] args) 
   {
        for(int i=0;i<=2;i++)
        {
             for(int j=0;j<=1;j++)
            {
                System.out.print("*");
            }
            System.out.println("*");
        } 
   }
    
}

// works same
/*   for(int i=0;i<=2;i++)
        {
             for(int j=0;j<=2;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        } 
 */