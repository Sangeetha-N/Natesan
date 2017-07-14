import java.util.*;
import java.io.*;
import java.lang.*;
public class Sum{
  public static void main(String args[]) throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    Integer n=Integer.parseInt(br.readLine());
    
    int s=0;
    for(int i=1;i<=n;i++){
      s=s+n;
    }
    System.out.println(s);
  }
}
