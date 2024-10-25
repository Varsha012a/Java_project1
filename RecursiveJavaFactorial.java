public class RecursiveJavaFactorial{
public static void main(String[]args){
long nFactorial=FactorialProgram(9);
System.out.println(nFactorial);
}
public static long FactorialProgram(long n){
if(n<=1){
return 1;
}else{
return n*FactorialProgram(n-1);
}
}
}
