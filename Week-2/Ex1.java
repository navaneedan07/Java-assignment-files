import java.util.*;
class Bank {
    static int totalAccounts;
    public int accountNumber;
    public double balance;

    Bank(int accountNumber)
    {
        totalAccounts++;
        this.accountNumber=accountNumber;
        this.balance=0;
    }

    void deposit(int amount) {
        balance += amount;
    }

}
class Account {
    public static void main(String[] args) {
        System.out.println("Navaneedan S\n2024503557");
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of bank accounts : ");
        n = sc.nextInt();
        int accountNumber,amount;
        Bank[] account = new Bank[n];
        for(int i=0;i<n;i++) {
            System.out.println("Enter account number and amount to deposit : ");
            accountNumber=sc.nextInt();
            amount = sc.nextInt();
            account[i] = new Bank(accountNumber);
            account[i].deposit(amount);
        }
        System.out.println("Printing account details... \n");
        System.out.println("Number of accounts : "+Bank.totalAccounts);
        for(int i=0;i<n;i++) {
            System.out.println("Account number : "+account[i].accountNumber+"\nBalance : "+account[i].balance+"\n");
        }
    }
}