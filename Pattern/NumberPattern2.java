package Pattern;
public class NumberPattern2
{
    public static void main(String args[])
    
    {   int k=9;
        for(int i=1; i<=3; i++)
        {
           
            for(int j=1; j<=3; j++)
           {
            System.out.print(k--);
           }
           System.out.println();
        }
    }
}    
