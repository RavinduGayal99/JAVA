class program11unary{
public static void main(String[] args){
int x=10,y=0;
System.out.println("x :"+x);
System.out.println("y :"+y);
y=x++;
System.out.println("postfix");
System.out.println("x :"+x);
System.out.println("y :"+y);
x=10;
y=++x;
System.out.println("prefix");
System.out.println("x :"+x);
System.out.println("y :"+y);
}
}