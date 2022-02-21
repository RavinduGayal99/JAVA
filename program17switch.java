import java.util.Scanner;
class program17switch{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Input No. ");
int day=sc.nextInt();
switch(day){
case 1:
System.out.println("Monday");
break;
case 2:
System.out.println("Tuesday");
break;
case 3:
System.out.println("Wendsday");
break;
case 4:
System.out.println("Thursday");
break;
case 5:
System.out.println("Friday");
break;
default:
System.out.println("Weekend");
break;
}
}
}