import java.util.Scanner;
class flowchart13{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
System.out.print("Input Amount: Rs.");
int amount=scan.nextInt();
System.out.print("Input year(s): ");
int year=scan.nextInt();
System.out.print("Input rate: ");
int rate=scan.nextInt();
int interest=amount*year*rate/100;
System.out.println("Interest is Rs."+interest);
}
}