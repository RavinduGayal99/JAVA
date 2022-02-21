import java.util.Scanner;
class flowchart16{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
System.out.print("Input number of subject: ");
int n=scan.nextInt();
int mark,total=0,average=0,m;   // m is count
for(m=0;m<n;m++){
System.out.print("Input subject mark: ");
mark=scan.nextInt();
total+=mark;
}
average=total/n;
System.out.println("Average is "+average);
}
}