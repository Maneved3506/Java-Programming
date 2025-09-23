import java.util.Scanner;
public class ATMSimulator{
double Balance;
public ATMSimulator(double B){
Balance = B;
}
public void CheckBalance(){
System.out.println("The Balance is :" + Balance);
}
public void Deposit(double Amount){
if (Amount < 0){
throw new IllegalArgumentException("Deposit Amount Cannot be Negative");
}
Balance += Amount;
System.out.println("Deposited :" + Amount);
CheckBalance();
}
public void Withdraw(double Amt){
if (Amt<0){
throw new IllegalArgumentException("Withdraw Amount Cannot be Negative");
}
if (Amt > Balance){
throw new ArithmeticException("Insufficient Funds");
}
Balance -= Amt;
System.out.println("Withdraw Successful.Remaining Balance :"+ Balance);
}
public static void main (String[] args){
Scanner sc = new Scanner(System.in);
ATMSimulator ATM = new ATMSimulator(5000);
while (true){
System.out.println("ATM SIMULATOR");
System.out.println("1.Show Balance");
System.out.println("2.Deposit Amount");
System.out.println("3.Withdraw Amount");
System.out.println("4.Exit");
System.out.println("Enter the Choice :");
int choice = sc.nextInt();
try{
switch(choice){
case 1 :
ATM.CheckBalance();
break;
case 2:
System.out.println("Enter the amount you want to deposit :");
double Amount = sc.nextDouble();
ATM.Deposit(Amount);
break;
case 3:
System.out.println("Enter the amount you want to withdraw :");
double Amt = sc.nextDouble();
ATM.Withdraw(Amt);
break;
case 4:
System.out.println("Thank You !!!");
sc.close();
return;
default:
System.out.println("Invalid Choice, Please Try Again!!!!");
}
}
catch(Exception e){
System.out.println(e.getMessage());
}
}
}
}
