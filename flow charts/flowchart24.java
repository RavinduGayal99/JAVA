import java.util.Scanner;
class flowchart24{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
System.out.print("Input no. of modules: ");
int n=scan.nextInt();
int count,fmark=0;
for(count=0;count<n;count++){
System.out.print("Input module name: ");
String mname=scan.next();
System.out.print("Input Exam mark: ");
int emark=scan.nextInt();
System.out.print("Input Assignment mark: ");
int amark=scan.nextInt();
System.out.print("compulsory or optinal: ");
String t=scan.next();
if(t.equals("compulsory")){
fmark=(3*emark/5)+(2*amark/5);
}
else{
fmark=(emark+amark)/2;
}
System.out.println("Final mark is "+fmark);
}
}
}