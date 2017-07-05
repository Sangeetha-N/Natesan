import java.util.*;
import java.io.*;
import java.lang.*;
public class Evenodd{
public static void main(String args[])throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
Integer f=Integer.parseInt(br.readLine());
if(f%2==0){
System.out.println("Number is Even");}
else{
System.out.println("Number is Odd");}
}
}
