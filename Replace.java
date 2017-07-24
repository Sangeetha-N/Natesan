import java.util.*;
import java.io.*;
import java.lang.*;
public class Replace{
  public static void main(String args[]) throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String s=br.readLine();
    StringBuilder st=new StringBuilder(s);
    st.reverse();
    
    System.out.println(st);
    
    String sd=(st.toString()).replaceAll("[aeiouAEIOU]","");
    System.out.println(sd);
  }
}
