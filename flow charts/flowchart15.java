import java.util.Scanner;
class flowchart15{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
System.out.println("Input temperature: ");
int temp=scan.nextInt();
if(temp<32){
System.out.println("Below freezing point");
}else{
System.out.println("Above freezing point");
}
}
}