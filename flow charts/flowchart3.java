import java.util.Scanner;
class flowchart3{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
System.out.print("Input no. one: ");
int x=scan.nextInt();
System.out.print("Input no. two: ");
int y=scan.nextInt();
int max;
if(x>y){
max=x;
}else{
max=y;
}
System.out.println("Max is "+max);
}
}