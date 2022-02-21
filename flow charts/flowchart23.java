import java.util.Scanner;
class flowchart23{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
System.out.print("Input no. of modules: ");
int n=scan.nextInt();
int count;
for(count=0;count<n;count++){
System.out.print("Input module name: ");
String mname=scan.next();
System.out.print("compulsory or optional: ");
String t=scan.next();
if(t.equals("compulsory")){
System.out.println(t+" Exam 60% Assignment 40%");
}
else{
System.out.println(t+" Exam 50% Assignment 50%");
}
System.out.println();
}
}
}