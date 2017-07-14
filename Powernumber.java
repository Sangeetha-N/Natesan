import java.util.*;
import java.io.*;
import java.lang.*;
public class Powernumber{
  public static void main(String args[])throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    Integer f=Integer.parseInt(br.readLine());
    double h;
    h=Math.sqrt(f);
    System.out.println(h);
  }
}
