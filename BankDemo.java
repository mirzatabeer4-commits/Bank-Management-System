import java.util.Scanner;
public class BankDemo {
public static void main(String [] args) {
Scanner sc=new Scanner(System.in);
CheckingAccount c = new CheckingAccount(101);

System.out.println("Enter Deposit Amount: ");
double d=sc.nextDouble();
c.deposit(d);
try {
System.out.println("\nEnter Amount you want to withdraw: ");
double w=sc.nextDouble();
c.withdraw(w);
} catch (InsufficientFundsException e) {
System.out.println("Sorry, but you are short $" + e.getAmount());
e.printStackTrace();
} }
}