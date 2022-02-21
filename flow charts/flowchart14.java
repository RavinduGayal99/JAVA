import java.util.Scanner;
class flowchart14{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
System.out.print("Input number: ");
int n=scan.nextInt();
int x=n%2;
if(x==0){
System.out.println("Even number!");
}else{
System.out.println("Odd number!");
}
}
}