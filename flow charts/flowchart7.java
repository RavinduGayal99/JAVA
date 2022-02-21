import java.util.Scanner;
class flowchart7{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
System.out.print("Input first number x: ");
int x=scan.nextInt();
System.out.print("Input second number: ");
int y=scan.nextInt();
if(x==y){
System.out.println("Both values are equal!");
}
else if(x>y){
System.out.println("Max is "+x);
}
else{
System.out.println("Max is "+y);
}
}
}