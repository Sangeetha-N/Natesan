import java.util.*;
import java.io.*;
import java.lang.*;
public class Integerreverse{
  public static void main(String args[]) throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    Integer g=Integer.parseInt(br.readLine());
    String h=g.toString();
    StringBuffer hh=new StringBuffer(h);
    hh.reverse();
    System.out.println(hh); 
  }
}
