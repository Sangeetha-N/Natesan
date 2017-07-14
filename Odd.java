import java.util.*;
import java.io.*;
import java.lang.*;
public class Odd{
  public static void main(String args[]) throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    ArrayList<Integer> l1=new ArrayList<>();
    ArrayList<Integer> l2=new ArrayList<>();
    Integer f=Integer.parseInt(br.readLine());
    Integer f1=Integer.parseInt(br.readLine());
    for(int i=f;i<=f1;i++){
      if(i%2==0){
      l2.add(i); }
      else{
        l1.add(i);
      }
        }
      System.out.println(l1);
   
    
  }
}
