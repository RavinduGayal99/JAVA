import java.util.Scanner;
class flowchart12{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
System.out.print("Input a name: ");
String name=scan.nextLine();
int count=0;
do{
System.out.println(name);
count++;
}while(count<5);
}
}