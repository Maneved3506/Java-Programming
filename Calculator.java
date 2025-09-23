import java.util.Scanner;
public class Calculator{
private double num1, num2;
private char operator;
public void getInput() {
 Scanner scanner = new Scanner(System.in);
 try{
 System.out.print("enter the first number:");
 num1 = Double.parseDouble(scanner.nextLine());
 System.out.println("enter the operator(+,-,*,/):");
 operator = scanner.nextLine().charAt(0);

 System.out.print("enter the second number:");
 num2 = Double.parseDouble(scanner.nextLine());
 } catch (NumberFormatException e) {
 System.out.println("Invalid input. Please enter numeric values.");
 getInput();
 }
}
public void calculate(){
 double result;
 switch(operator) {
 case '+' :
 result = add(num1, num2);
 break;
 case '-' :
 result = subtract(num1, num2);
 break;
 case '*' :
 result = multiply(num1, num2);
 break;
 case '/' :
 if(num2 == 0) {
 System.out.println("Error: Division by zero is not allowed");
 return;
 }
 result = divide(num1, num2);
 break;
 default:
 System.out.println("Invalid operator.Please use +, -, *, or /,");
 return;
 }
 System.out.println("Result:" + result);
 }

 private double add(double a, double b){
 return a + b;

 }
 private double subtract(double a, double b){
 return a - b;

 }
 private double multiply(double a, double b){
 return a * b;

 }
 private double divide(double a, double b){
 return a / b;

 }
 public static void main(String[] args){
 Scanner scanner = new Scanner(System.in);
 boolean continueCalc = true;

 System.out.println("===== OOP-Based Java Calculator =====");
 while (continueCalc) {
 Calculator calc = new Calculator();
 calc.getInput();
 calc.calculate();
 System.out.println("Do you want to perform another calculations?(yes/no):");
 String responce = scanner.nextLine().trim().toLowerCase();
 if(!responce.equals("yes")){
 continueCalc = false;
 System.out.println("Goodbye");
 }
 }

 scanner.close();
 }
}
