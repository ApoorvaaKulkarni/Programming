import java.util.Scanner;

public class BankingSystem {
    private String name;
    private int account_Number;
    private long balance;
    private int Pin_number;
    Scanner sc = new Scanner(System.in);

    public void CreateAccount(String name,int account_Number,long balance,int Pin_number){
        this.name=name;
        this.account_Number=account_Number;
        this.balance= balance;
        this.Pin_number=Pin_number;


    }
    public void DisplayDetails(){
        System.out.println("Name of the account holder: " + name);
        System.out.println("Account Number : " + account_Number);
        System.out.println("Pin Number :" + Pin_number);
        System.out.println("Balance  :" + balance);
    }
    public void DepositMoney(){
        double amount;
        System.out.print("Enter Amount to be deposited : ");
        amount = sc.nextDouble();
        balance = (long) (balance + amount);
        System.out.println("Amount Deposited");
    }
    public void WithDrawMoney(){
        double amount;
        System.out.print("Enter amount to withdraw : ");
        amount = sc.nextDouble();
        if(balance >= amount){
            balance = (long) (balance - amount);
            System.out.println("Collect your amount " + amount);
        }else{
            System.out.println("Insufficient balance in your account");
        }

}


}
class Bank{
    public static void main(String[] args) {
        BankingSystem b = new BankingSystem();
        b.CreateAccount("Apoorva",12344,1999,1234);
        b.DisplayDetails();
        b.DepositMoney();
        b.WithDrawMoney();
    }
}
