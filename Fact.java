import java.util.*;
import java.io.*;
import java.lang.*;
public class Fact{
  public static void main(String args[]) throws IOException{
    int sum=1;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    Integer b=Integer.parseInt(br.readLine());
    for(int i=1;i<=b;i++){
      sum =sum*i;
    }
    System.out.println(sum);
  }
}
