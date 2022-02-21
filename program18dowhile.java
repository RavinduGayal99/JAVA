class program18dowhile{
public static void main(String[] args){
int n=0;
int sum=0;
System.out.println("Total of first five numbers");
do{
sum=sum+n;
n+=1;
}while (n<=5);
System.out.println("Total: "+sum);
}
}