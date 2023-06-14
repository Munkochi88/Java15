package object;

public class BankTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.displayInfo();
        account.deposit(100000);
        account.withdraw(10989989);
        account.userName = "joseph1234";
        account.password = "password";
        account.logIn("joseph1234","password");
        account.signUp("nick","efe","321",200);
        account.displayInfo();

        BankAccount java1 = new BankAccount();
        System.out.println(java1.isLoggedIn);
        java1.displayInfo();
        java1.signUp("dima","flower","white",59893);
        java1.logIn("flower","white");
        java1.displayInfo();
    }
}
