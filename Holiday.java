import java.util.*;
import java.io.*;
import java.lang.*;
public class Holiday {
  public static void main(String args[]) throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String str=br.readLine();
    if(str.equals("sunday")){
      System.out.println("false");
    }
    else{
      System.out.println("true");
    }
  }
}
