import java.util.Scanner;
class flowchart6{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
System.out.print("Input number for x: ");
int x=scan.nextInt();
System.out.print("Input number for y: ");
int y=scan.nextInt();
System.out.print("Input number for z: ");
int z=scan.nextInt();
int max;
if(x>y){
if(x>z){
max=x;
}else{
max=z;
}
}else if(y>z){
max=y;
}else{
max=z;
}
System.out.println("Max is "+max);
}
}