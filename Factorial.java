import java.util.*;
import java.io.*;
import java.lang.*;
public class Factorial{
  public static void main(String args[]) throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    Integer d=  Integer.parseInt(br.readLine());
    int s=1; 
    for(int i=1;i<=d;i++){
      s=s*i;
    }
    System.out.println(s);
  }
