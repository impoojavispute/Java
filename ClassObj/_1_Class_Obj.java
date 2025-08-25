package ClassObj;
 class TeaType
    {
        String flavor;
        int sugarLevel;
        String size;

        void printOrder ()
        {
            System.out.println("Order 1: " + flavor + ", Sugar: " + sugarLevel + ", Size: " + size);
            System.out.println("Order 2: " + flavor + ", Sugar: " + sugarLevel + ", Size: " + size);
        }

        
    }


public class _1_Class_Obj 
{

    
   public static void main(String[] args) 
   {
        //order 1 

        TeaType TT1 = new TeaType();
        TT1.flavor = "Masala";
        TT1.sugarLevel = 1;
        TT1.size = "Small";

        //order 2
        TeaType TT2 = new TeaType();
        TT2.flavor = "Masala";
        TT2.sugarLevel = 2;
        TT2.size = "Medium";

        TT1.printOrder();
        TT2.printOrder();

    
   }





}
