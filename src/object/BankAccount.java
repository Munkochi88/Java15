package object;

public class BankAccount {
    /*
    * New Class: BankAccount
variables:
-accountHolderName, bankName, balance, userName, password, isLoggedIn
Methods:
- void displayInfo() ->will print out all account information
- double deposit() -> one parameter to update balance
- double withdraw() -> one parameter to update balance
-void logIn() -> userName, password parameters to update isLoggedIn boolean.
     */
    String accountHolderName = "Joseph";
    String bankName = "Citi";
    double balance = 101.78;
    String userName;
    String password;
    Boolean isLoggedIn = false;

    // create a method that will initialize instance fields
    // void signUp();
    public void displayInfo(){
        if (isLoggedIn){
            System.out.println("Account holderName = "+accountHolderName +
                    " bankName = "+bankName+"Your balance = "+balance);
        }else{
            System.out.println("Should be logged in first");
        }
    }
    public double deposit(double depositMoney){
        balance=+depositMoney;
        System.out.println("your balance after depositing "+ balance);
        return balance;
    }
    public double withdraw(double withdrawMoney){
        balance=-withdrawMoney;
        System.out.println("you balance after withdraw "+balance);
        return balance;
    }
    public void logIn(String user, String pass){
        if (userName.equals(user) && password.equals(pass)){
            System.out.println("You successfully logged in");
            isLoggedIn = true;
            System.out.println("INFORMATION AFTER LOG IN");
            displayInfo();
        }else{
            isLoggedIn = false;
            System.out.println("Please check userName or Password");
        }
    }
    public void signUp(String accountHolderName1,String userName1, String password1, double balance1){
        accountHolderName = accountHolderName1;
        userName = userName1;
        password = password1;
        balance = balance1;
        System.out.println("signUp process is done!");
    }
}
