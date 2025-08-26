package OOPS;

//Parent Class
class Restaurant 
{
    public double calculateBill(double basePrice) 
    {
        return basePrice;  // plain bill, no extra charges
    }
}

//Child Classes

class FastFood extends Restaurant {
    @Override
    public double calculateBill(double basePrice) {
        /*
          If you order food worth ₹500:
          Bill = 500

          If GST = 5%:
          GST amount = 500 × 0.05 = 25
          Final Bill = 500 + 25 = 525
        */
        
        // add 5% GST
        return basePrice + basePrice * 0.05;  
    }
}

class FineDining extends Restaurant 
{
    @Override
    public double calculateBill(double basePrice)
     {
        // Add 18% GST + 10% service charge

        double withGst = basePrice + basePrice * 0.18;
        return withGst + withGst * 0.10;
    }
}

class StreetFood extends Restaurant {
    @Override
    public double calculateBill(double basePrice) 
    {
        // Add only 2% GST
        return basePrice + basePrice * 0.02;
    }
}


public class _3_MethOveriding_Food_Delivery_Blling
{
    public static void main(String[] args) 
    {
        Restaurant r1 = new Restaurant();
        Restaurant r2 = new FastFood();
        Restaurant r3 = new FineDining();
        Restaurant r4 = new StreetFood();

        double price = 500;

        System.out.println("Generic Restaurant: " + r1.calculateBill(price));
        System.out.println("FastFood: " + r2.calculateBill(price));
        System.out.println("FineDining: " + r3.calculateBill(price));
        System.out.println("StreetFood: " + r4.calculateBill(price));
        
    }
       
}



