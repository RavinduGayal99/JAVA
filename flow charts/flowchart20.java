import java.util.Scanner;
class flowchart20{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
System.out.print("Input a number: ");
int n=scan.nextInt();
int fact;
for(fact=1;n>=1;n--){
fact*=n;
}
System.out.println("Fact is "+fact);
}
}