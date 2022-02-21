import java.util.Scanner;
class program10input{
public static void main(String[] args){
String name="";
Scanner sc=new Scanner(System.in);
System.out.print("Input your Name: ");
name=sc.nextLine();
System.out.print("Input your age: ");
int num=sc.nextInt();
System.out.println("Name: "+name);
System.out.println("Age: "+num);
}
}