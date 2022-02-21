import java.util.Scanner;
class flowchart21{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
System.out.print("Input No. of student(s): ");
int m=scan.nextInt();
int mc,nc,total=0,average=0; // count
for(mc=0;mc<m;mc++){
System.out.print("Input No. of subject(s): ");
int n=scan.nextInt();
for(nc=0;nc<n;nc++){
System.out.print("Input subject mark: ");
int mark=scan.nextInt();
total+=mark;
}
average=total/n;
System.out.println("Average is "+average);
System.out.println();
}
}
}