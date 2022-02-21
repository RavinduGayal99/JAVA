import java.util.Scanner;

public class program26arrayinput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ar[];
        int temp=0;
        ar=new int[5];
        for (int i=0;i<ar.length;i++) {
            System.out.print("int value:");
            ar[i] = sc.nextInt();
        }
        for (int i=0;i<ar.length;i++){
            for (int j=0;j<ar.length-1;j++){
                if (ar[j]<ar[j+1]){
                    temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("ordered Array");
        for (int j=0;j<ar.length;j++){
            System.out.print(ar[j]+"|");
        }
        for (int i=0;i<ar.length;i++){
            for (int j=0;j<ar.length-1;j++){
                if (ar[j]>ar[j+1]){
                    temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("ordered Array");
        for (int j=0;j<ar.length;j++){
            System.out.print(ar[j]+"|");
        }
    }
}
