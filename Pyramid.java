import java.util.*;
import java.io.*;
import java.lang.*;
public class Pyramid{
  public static void main(String args[]) throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the pyramid limit");
    Integer g=Integer.parseInt(br.readLine());
    System.out.println("pyramid:");
    for(int i=0;i<g;i++) {
      for(int j=0;j<g-i;j++) {
        System.out.print(" ");
      }
      for(int k=0;k<=i;k++) {
        System.out.print("* ");
      }
      System.out.println();  
    }
    
  }
}
