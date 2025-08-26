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

//child class -3 
class Truck extends vehicle
{
    public void move()
    {
        System.out.println("This is Truck...!!!");
    }
}




public class _2_MethodOveriding 
{
    
    public static void main(String[] args) 
    {
        vehicle v1 = new vehicle();
        vehicle v2 = new Car();
        vehicle v3 = new Bike();
        vehicle v4 = new Truck();

        v1.move(); 
        v2.move(); 
        v3.move();
        v4.move(); 
    }
    


}
