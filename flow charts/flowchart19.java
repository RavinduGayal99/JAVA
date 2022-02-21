import java.util.Scanner;
class flowchart19{
public static void main(String[] args){
int total=0,r;
Scanner scan=new Scanner(System.in);
System.out.print("Input starting range: ");
int x=scan.nextInt();
System.out.print("Input ending range: ");
int y=scan.nextInt();
while(x<=y){
r=x%2;
if(r==0){
total+=x;
}
x++;
}
System.out.println("Total of even numbers is "+total);
}
}