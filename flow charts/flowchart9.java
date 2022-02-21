import java.util.Scanner;
class flowchart9{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
double price;
int x;
System.out.print("Input previous reading: ");
int previous=scan.nextInt();
System.out.print("Input current reading: ");
int current=scan.nextInt();
int change=current-previous;
if(change<60){
price=change*1.50;
}else if(change<80){
price=(60*15.0)+(change-60)*2.25;
}else{
x=change-80;
price=(60*1.50)+(change-60-x)*2.25+x*4;
}
System.out.println("Price: Rs."+price);
}
}