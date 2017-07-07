import java.util.*; 
import java.io.*;
import java.lang.*;
public class Largeno{
  public static void main (String args[]) throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    Integer q=Integer.parseInt(br.readLine());
    Integer q1=Integer.parseInt(br.readLine());
    Integer q2=Integer.parseInt(br.readLine());
    if((q>q1)&&(q>q2)){
      System.out.println("Large number:"+q);
    }
    else if((q1>q)&&(q1>q2)){
      System.out.println("Large number:"+q1);
    }
    else{
      System.out.println("Large number:"+q2);
    }
  }
}
  
