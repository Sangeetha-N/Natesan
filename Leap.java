import java.util.*;
import java.io.*;
import java.lang.*;
public class Leap{
  public static void main(String args[]) throws IOException{
    BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    Integer y=Integer.parseInt(br.readLine());
    if((y%400==0)&&(y%100!=0)&&(y%4==0)){
      System.out.println("leap year: "+y);
    }
    else{
      System.out.println("not leap year: "+y);
    }
  }
}
