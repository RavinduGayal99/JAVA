import java.util.Scanner;
public class program25array3 {
    public static void main(String[] args) {
        int ar[];
        ar=new int[5];
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for (int i=0;i<ar.length;i++){
            System.out.println("int value:");
            ar[i]=sc.nextInt();
        }
        System.out.println("Array");
        for (int i=0;i<ar.length;i++){
            System.out.print(ar[i]+"|");
        }
    }

}
