import java.util.Scanner;

public class program292darrayinput2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int rows,cols;
        System.out.println("Multidiementional Arrray User Input");
        int ar[][]=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print("Enter a number: ");
                ar[i][j]=scan.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println("ar["+i+"]["+j+"] = 1"+ar[i][j]);
            }
        }
    }
}
