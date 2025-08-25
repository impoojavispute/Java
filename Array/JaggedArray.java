package Array;
public class JaggedArray
{
    public static void main(String[] args) 
    {
        int nums[][]= new int [3][4]; 
        
        nums[0] = new int[4];
        nums[1] = new int[3];
        nums[2] = new int[2];
        
        
        for (int i=0; i<3;i++)
        {
            for (int j = 0; j < nums[i].length; j++)
            {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }   
}
