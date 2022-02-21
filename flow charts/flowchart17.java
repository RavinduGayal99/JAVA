import java.util.Scanner;
class flowchart17{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
System.out.print("input temperature unit type(farenheit or celsius): ");
String type=scan.nextLine();
int tc;
int tf;
if(type.equals("farenheit")){
System.out.print("Input farenheit unit: ");
tf=scan.nextInt();
tc=(tf-32)*5/9;
System.out.println(tc+"*C");
}else{
System.out.println("Input celsius unit: ");
tc=scan.nextInt();
tf=(tc*9/5)+32;
System.out.println(tf+"*F");
}
}
}