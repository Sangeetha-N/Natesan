import java.util.*;
import java.io.*;
import java.lang.*;
public class Changestring{
  public static void main(String args[]) throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String s=br.readLine();
    char a[]=s.toCharArray();
    System.out.println(s.charAt(0)+"   "+s.charAt(s.length()-1));
    System.out.println(" "+s.charAt(1)+" "+s.charAt(s.length()-2));
    System.out.println("  "+s.charAt(2)); 
    System.out.println(" "+s.charAt(1)+" "+s.charAt(s.length()-2)); 
    System.out.println(s.charAt(0)+"   "+s.charAt(s.length()-1));
  }
}
