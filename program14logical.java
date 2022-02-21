import java.util.Scanner;
class program14logical{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Input two numbers");
int num1=sc.nextInt();
int num2=sc.nextInt();

boolean result;
System.out.println("And operator");
result= num1>num2 && num1==num2;
System.out.println("num1>num2 && num1==num2:"+result);
result= num1>num2 && num1!=num2;
System.out.println("num1>num2 && num1!=num2:"+result);
result= num1<num2 && num1==num2;
System.out.println("num1<num2 && num1==num2:"+result);
result= num1<num2 && num1!=num2;
System.out.println("num1<num2 && num1!=num2:"+result);

System.out.println("OR operator");
result= num1>num2 || num1==num2;
System.out.println("num1>num2 || num1==num2:"+result);
result= num1>num2 || num1!=num2;
System.out.println("num1>num2 || num1!=num2:"+result);
result= num1<num2 || num1==num2;
System.out.println("num1<num2 || num1==num2:"+result);
result= num1<num2 || num1!=num2;
System.out.println("num1<num2 || num1!=num2:"+result);

System.out.println("Not operator");
result= !(num1==num2);
System.out.println("!(num1==num2):"+result);
}
}