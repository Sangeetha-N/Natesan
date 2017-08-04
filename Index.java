import java.util.*;
import java.io.*;
import java.lang.*;
public class Index{
  public static void main(String args[]) throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    ArrayList<Integer> a=new ArrayList<>();
    ArrayList<Integer> b=new ArrayList<>();
    Integer n=Integer.parseInt(br.readLine());
    for(int i=0;i<n;i++){
      Integer num=Integer.parseInt(br.readLine());
      a.add(num); 
    }
    
    for(int j=0;j<n-1;j++){
      int c=a.get(j)-a.get(j+1);
      b.add(Math.abs(c));
    } 
    Integer c=Collections.max(b);
    Integer d= b.indexOf(c);
    System.out.println(d);
    
  }
}
