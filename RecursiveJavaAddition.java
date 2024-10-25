public class RecursiveJavaAddition{
public static void main(String[]args){
long nAddition=AdditionProgram(10);
System.out.println(nAddition);
}
public static long AdditionProgram(long n){
if(n<=1){
return 1;
}else{
return n+AdditionProgram(n-1);
}
}
}