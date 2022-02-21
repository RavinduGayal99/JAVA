import java.util.Scanner;
class flowchart22{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
System.out.print("Is type compulsory or optional :");
String stype=scan.nextLine();
System.out.print("Input subject name: ");
String sname=scan.nextLine();
if(stype.equals("compulsory")){
System.out.println(sname+" 60% Exam mark and 40% Assignment mark");
}
else if(stype.equals("optional")){
System.out.println(sname+" 50% Exam mark and 50% Assignment mark");
}
}
}