package ClassObj;

import java.util.Scanner;

class Pet 
{
    String name;
    String species;
    int age;
    boolean isVaccinated;
    //boolean status;

    void printInfo(int ID)
    {
        System.out.println("  ");
        System.out.println("Pet ID:" + ID);
        System.out.println("Pet Name:" + name);
        System.out.println("Pet Age:" + age);
        System.out.println("Pet species:" + species);
        System.out.println("Vaccination Status:" + isVaccinated);
        System.out.println("--------------------------");
    }

    void updateVaccinationStatus(boolean status)
    {
        isVaccinated = status;
    }

}



public class _5_Pet_Clinic_System_31_July
{

    public static void main(String[] args) 
    {
        //array to store multiple pets 
        Scanner sc = new Scanner(System.in);
        Pet[] p = new Pet[10];  //issue is this initialize class or created array?
        int petCount = 0;

        for(int i = 0; i < p.length; i++)
        {
            p[i]= new Pet();
        }

        int choice = 0;
        //String name;
        //String species;
        //int age;
        //boolean isVaccinated;
        int ID ;
        //boolean updatedStatus;

        do 
        {
                System.out.println("---Pet Clinic System ---");
                System.out.println("1. Add New Pet. ");
                System.out.println("2. View All Pets. ");
                System.out.println("3. Update Vaccination Status. ");
                System.out.println("4. Exit. ");
                 System.out.println("  ");
                System.out.println(" Enter Your Choice: ");
                choice = sc.nextInt();
                sc.nextLine();
                switch (choice) 
                {
                    case 1:

                    if (petCount > p.length)
                    {
                        System.out.println("Pet Limit reached , Can not add more pet. ");
                    }
                    
                    System.out.println("Enter Pet Name:  ");
                    p[petCount].name = sc.nextLine();

                    System.out.println("Enter Pet Species:  ");
                    p[petCount].species = sc.nextLine();

                    System.out.println("Enter Pet Age:  ");
                    p[petCount].age = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Is Pet Vaccinated:  ");
                    p[petCount].isVaccinated = sc.nextBoolean();

                    System.out.println("  ");
                    System.out.println("Pet Added Successfully. ");
                    petCount++;

                    System.out.println("  ");
                    
                    break;
                    
                    case 2:
                    if (petCount == 0) 
                    {
                        System.out.println("No pets registered yet.");
                    } 
                    else 
                    {
                        for (int i = 0; i < petCount; i++) 
                        {
                            p[i].printInfo(i);
                        }
                    }
                    break;

                    case 3 :
                    System.out.println("Enter Pet ID to update: ");
                    ID = sc.nextInt();

                    if (ID >= 0 && ID < petCount) 
                    {
                        System.out.println("  ");
                        System.out.println("Is the pet now vaccinated? (true/false): ");
                        boolean updatedStatus = sc.nextBoolean();
                        sc.nextLine(); 
                        p[ID].updateVaccinationStatus(updatedStatus);
                        System.out.println("  ");
                        System.out.println("Vaccination status updated!");
                        System.out.println("  ");
                    }
                    else 
                    {
                        System.out.println("Invalid Pet ID.");
                    }
                    break;
                
                    default:
                        break;
                }

                

        }

        while ( choice != 4);
        System.out.println(" Good Bye! ");
        
        sc.close();

    }   
    
    
}
