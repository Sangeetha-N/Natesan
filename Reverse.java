import java.util.*;
import java.io.*;
import java.lang.*;
public class Reverse{
  public static void main(String args[]) throws IOException{
    BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    String h=br.readLine();
    StringBuffer he=new StringBuffer(h);
    he.reverse();
    System.out.println(he);
  }
