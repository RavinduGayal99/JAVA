import java.util.Scanner;
class flowchart5{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
System.out.print("Input mark: ");
int mark=scan.nextInt();
if(mark>=75){
System.out.print("Grade A");
}else if(mark>=65){
System.out.print("Grade B");
}else if(mark>=50){
System.out.print("Grade C");
}else if(mark>=35){
System.out.print("Grade S");
}else{
System.out.print("Grade F");
}
}
}