class flowchart18{
public static void main(String[] args){
int total=0,number=0,x;
while(number<=20){
x=number%2;
if(x==0){
total+=number;
}
number++;
}
System.out.println("Total of even between 0 to 20 is "+total);
}
}