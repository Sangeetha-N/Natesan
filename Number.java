
import java.util.*;
import java.io.*;
import java.lang.*;
public class Number{
public static void main(String args[]) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
Integer s=Integer.parseInt(br.readLine());
if(n>0){
System.out.println("Positive");
}
else if(n<0){
System.out.println("Negative");
}
else{
System.out.println("n is string or zero");
}
}
}
