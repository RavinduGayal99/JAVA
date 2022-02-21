import java.util.Scanner;
class program16ifelseif{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Input value for number 1: ");
int num1=sc.nextInt();
System.out.print("Input value for number 2: ");
int num2=sc.nextInt();
if(num1==num2){
System.out.println("Both numbers are equal!");
}else if(num1>num2){
System.out.println("number 1 is maximum: "+num1);
}else{
System.out.println("number 2 is maximum: "+num2);
}
}
}