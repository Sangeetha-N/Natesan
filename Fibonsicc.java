import java.util.*;
import java.io.*;
import java.lang.*;
public class Fibonsicc{
  public static void main(String args[]) throws IOException{
    BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
    Integer g=Integer.parseInt(br.readLine());
    int q=0,q1=1,e,q2=-1;
    for(int i=1;i<=g;i++){
      e=q1+q2;
      System.out.println(e);
      q2=q1;
      q1=e;
    }
  }
}
