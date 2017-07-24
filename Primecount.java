import java.util.*;
import java.io.*;
import java.lang.*;
public class Primecount{
  public static void main(String args[]) throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    ArrayList<Integer> s=new ArrayList<>();
    int i,j,count=0;
    Integer w=Integer.parseInt(br.readLine());
    Integer e=Integer.parseInt(br.readLine());
    for( i=w;i<=e;i++){
      for( j=2;j<i;j++){
        if(i%j==0){
          
          break;
        }
        
      }
      if(i==j){
        count++;
        s.add(i);
        
      }
    }
    System.out.println(s);
    System.out.println(count);
  }
  
}
    
    

