import java.util.Scanner;
class flowchart4{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
System.out.print("Input mark: ");
int mark=scan.nextInt();
if(mark>=50){
System.out.println("Pass");
}else{
System.out.println("Fail");
}
}
}