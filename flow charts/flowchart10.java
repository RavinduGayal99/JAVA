import java.util.Scanner;
class flowchart10{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
System.out.print("Input employee type(fulltime or parttime): ");
String type=scan.nextLine();
int salary;
if(type.equals("fulltime")){
System.out.print("Basic salary: Rs.");
int basic=scan.nextInt();
System.out.print("OT hours: ");
int ot=scan.nextInt();
System.out.print("OT rate: Rs.");
int rate=scan.nextInt();
salary=basic+ot*rate;
}else{
System.out.print("Working hours: ");
int wh=scan.nextInt();
System.out.print("Hourly rate: ");
int hrate=scan.nextInt();
salary=wh*hrate;
}
System.out.println();
System.out.println("Salary is Rs."+salary);
}
}