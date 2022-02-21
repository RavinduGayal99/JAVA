public class program25bubblesort {
    public static void main(String[] args) {
        int ar[]={12,38,81,8,52};
        int temp=0;
        System.out.println("Unordered Array");
        for (int j=0;j<ar.length;j++){
            System.out.print(ar[j]+"|");
        }
        for (int i=0;i<ar.length;i++){
            for (int j=0;j<ar.length;j++){
                if (ar[j]<ar[j+1]){
                    temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
        System.out.println("Unordered Array");
        for (int j=0;j<ar.length;j++){
            System.out.print(ar[j]+"|");
        }
    }
}