class BasicPhone{
String model;
int make;
void Basic(){
System.out.println("The Model is:"+ model);
System.out.println("The make Year is:"+ make);
}
}
class Smartphone extends BasicPhone{
String biometric;
void Advance(){
Basic();
System.out.println("Biometric Present:"+ biometric);
}
}
public class InheritanceDemo{
public static void main(String[] args){
Smartphone MySmartphone = new Smartphone();
MySmartphone.model = "Samsung";
MySmartphone.make = 2025;
MySmartphone.biometric = "Yes";
MySmartphone.Advance();
}
}
