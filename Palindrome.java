import java.util.*;
import java.io.*;
import java.lang.*;
public class palindrome{
  public static void main(String args[]) throws IOException{
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    String str=br.readLine();
    StringBuffer g=new StringBuffer(str);
    String str1=g.reverse().toString();
    if(str.equals(str1)){
      System.out.println("Palindrome");
    }
    else{
      System.out.println(" Not Palindrome");
    }
  }
}
