package OOPS;

//Parent Class
class vehicle 
{
    public void move ()
    {
        System.out.println("The vehicle moves...");
    }
}

//child class - 1 
class Car extends vehicle 
{
    @Override
    public void move() 
    {
        System.out.println("The car drives on roads 🚗");
    }
}

//child class - 2
class Bike extends vehicle 
{
    @Override
    public void move() 
    {
        System.out.println("The bike rides on two wheels 🏍️");
    }
}


public class _2_MethodOveriding 
{
    
    public static void main(String[] args) 
    {
        vehicle v1 = new vehicle();
        vehicle v2 = new Car();
        vehicle v3 = new Bike();

        v1.move(); 
        v2.move(); 
        v3.move(); 
    }
    


}
