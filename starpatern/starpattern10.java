class starpattern10{
public static void main(String[] args){
for(int n=0;n<5;n++){
for(int m=5;m>n;m--){
System.out.print(" ");
}
for(int x=0;x<n;x++){
System.out.print("*");
}
for(int y=1;y<n;y++){
System.out.print("*");
}
System.out.println();
}
}
}