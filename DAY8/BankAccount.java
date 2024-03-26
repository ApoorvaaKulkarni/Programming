import java.util.Scanner;

public class BankAccount {

    public static void main(String[] args) {
        Bank b = new Bank(20000);
        SavingsAccount s = new SavingsAccount(200);
        s.withdraw(300);
        System.out.println(b.getBalance());


    }



    public static class Bank{
        private int balance;
        public Bank(int balance){
            this.balance= balance;
        }


        public void deposit(){
            int amount = 0;
            System.out.println("Enter the amount to be deposited");
            balance +=  amount;

        }
        public void withdraw(int amount){

            System.out.println("Enter the amount to be withdrawn: ");
            Scanner sc = new Scanner(System.in);
            int WithdrawAmount = sc.nextInt();
            if(WithdrawAmount > balance){
                System.out.println("Insufficient balance");
            }else{
                int total = 0;
                total = balance - WithdrawAmount;
            }

        }
        public int getBalance(){
            return balance;
        }
    }
    public static class SavingsAccount extends Bank{
        public SavingsAccount(int balance) {
            super(balance);
        }


        @Override
        public void withdraw(int amount) {
            if((getBalance() - amount) < 100){
                System.out.println("Minimum balance of 100 is required");
            }else{
                super.withdraw(amount);
            }

        }
    }


}
