import java.util.Scanner;
class flowchart2{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
System.out.print("Input value x:");
int x = scan.nextInt();
System.out.print("Input value y:");
int y= scan.nextInt();
System.out.print("Input value z:");
int z= scan.nextInt();
int total;
int avg;
avg=(x+y+z)/3;
System.out.println("Average is "+avg);
}
}