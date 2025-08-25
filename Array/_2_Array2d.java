package Array;
public class _2_Array2d 
{
    public static void main(String[] args) 
    {
        int nums[][]= new int[3][4];

        //Login for random values // math.random gives .1 value , for whole number multiply it
        //int random= (int) (Math.random()*10);

        for (int i=0; i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                nums[i][j] =(int) (Math.random()*10);// assign random value to array [3][4]
            }
            System.out.println();
        }

       // System.out.println(nums[][]); 
       //In Java, you can't print an entire 2D array using System.out.println(nums[][]); because:nums[][] is not valid Java syntax.
       //System.out.println does not know how to print a single / 2D array directly.


        //solution - 
        for (int i=0; i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }    
}
