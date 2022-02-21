import java.util.Scanner;
class flowchart8{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
System.out.print("Input name: ");
String name=scan.nextLine();
System.out.print("Input gender(male or female): ");
String gender=scan.nextLine();
System.out.print("Input married status(married or unmarried): ");
String mstatus=scan.nextLine();
if(gender.equals("male")){
System.out.println("Mr."+name);
}else if(mstatus.equals("married")){
System.out.println("Mrs."+name);
}else{
System.out.println("Miss "+name);
}
}
}