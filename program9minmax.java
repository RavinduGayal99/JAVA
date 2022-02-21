class program9minmax{
public static void main(String[] args){
int intmin,intmax;
byte bytmin,bytmax;
float fltmin,fltmax;
long lngmin,lngmax;
short shtmin,shtmax;
double dblmin,dblmax;

fltmin=Float.MIN_VALUE;
fltmax=Float.MAX_VALUE;

bytmin=Byte.MIN_VALUE;
bytmax=Byte.MAX_VALUE;

intmin=Integer.MIN_VALUE;
intmax=Integer.MAX_VALUE;

lngmin=Long.MIN_VALUE;
lngmax=Long.MAX_VALUE;

shtmin=Short.MIN_VALUE;
shtmax=Short.MAX_VALUE;

dblmin=Double.MIN_VALUE;
dblmax=Double.MAX_VALUE;

System.out.println("min value of long:"+lngmin);
System.out.println("max value of long:"+lngmax);
System.out.println();
System.out.println("min value of float:"+fltmin);
System.out.println("max value of float:"+fltmax);
System.out.println();
System.out.println("min value of int:"+intmin);
System.out.println("max value of int:"+intmax);
System.out.println();
System.out.println("min value of byte:"+bytmin);
System.out.println("max value of byte:"+bytmax);
System.out.println();
System.out.println("min value of short:"+shtmin);
System.out.println("max value of short:"+shtmax);
System.out.println();
System.out.println("min value of double:"+dblmin);
System.out.println("max value of double:"+dblmax);
}
}