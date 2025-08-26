package OOPS;

//BaseClass 
class BankAccount
{
    //Fields of base class - BankAccount
    String accountNumber;
    int balance;

    //Methods of base class - BankAccount
    public void deposit(double amount)
    {
        //increases balance
        balance += amount;
    }

    public void withdraw(double amount) 
    {
        //decreases balance (if enough funds)
        if (balance >= amount)
        {
            balance -= amount;
        }
        else
        {
            System.out.println("Cant Withdraw - Insufficient Balance");
        }
    }

    public void getBalance ()
    {
        System.out.println(balance);
    }
}

//SubClass 1 - SavingsAccount
class SavingsAccount  extends BankAccount 
{
    //Extra Field
    double interestRate;
    int minBalance = 1000;

   

    public SavingsAccount(String accountNumber , int balance, double interestRate) 
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount)
    {
        if(minBalance >=1000)
        {
         balance -= amount;
            System.out.println(accountNumber + " Withdrawn: " + amount + " | New Balance: " + balance);
        } else 
        {
            System.out.println(accountNumber + "  Cannot withdraw. Minimum balance of " + minBalance + " required.");
        }
    }
   
    //Extra Method
    public void addInterest()
    {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println(accountNumber + " Interest Added: " + interest + " | New Balance: " + balance);
    }
}

//SubClass 2 - CurrentAccount 
class CurrentAccount  extends BankAccount 
{
   //Extra Field
   int overdraftLimit;

    public CurrentAccount(String accountNumber, int balance, int overdraftLimit)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
       
    }
   

    public void withdraw(double amount)
    {
        if (balance < 0)
        {
            balance -= overdraftLimit;
        }
        else 
        {
            System.out.println(accountNumber + " Overdraft limit exceeded!");
        }
    }

}

//SubClass 3- SalaryAccount 
/*class SalaryAccount  extends SavingsAccount
{

  


    @Override
    public void withdraw(double amount)
    {
        if (amount > 0 && amount <= balance) 
        {
                    balance -= amount;                                                                //did not understand the logic for Salary Account 
                    System.out.println("Withdrawn: " + amount);
        } 
        else 
        {
                    System.out.println("Insufficient balance!");
        }
    }

   

}*/



public class _1_Inhe_MOriding_BankSystem 
{
    public static void main (String[] args)
    {

    SavingsAccount sa = new SavingsAccount("SA123", 5000, 4.0);
    CurrentAccount ca = new CurrentAccount("CA456", 2000, 1000);
    //SalaryAccount sal = new SalaryAccount();

    // Deposit
    sa.deposit(2000);
    ca.deposit(1000);

    // Withdraw 
    sa.withdraw(6000); // should warn about min balance
    ca.withdraw(3500); // should allow overdraft

    // Add Interest
    sa.addInterest();

    // Final Balances
    System.out.println("\n--- Final Balances ---");
    sa.getBalance();
    ca.getBalance();

    }
   
    
}
