import java.util.*;
import java.io.*;
import java.lang.*;
public class EmailId{
  public static void main(String[] args) {
    System.out.println("ENTER THE EMAIL ID");;
    Scanner in=new Scanner(System.in);
    String s=in.nextLine();
    int count=0;
    if(s.endsWith(".com"))
    {
      for(int i=0;i<s.length();i++)
      {
        if(s.charAt(i)=='@')
        {
          count++;
        }
      } 
      if(count==1)
      {
        int x=s.lastIndexOf('@');
        int y=s.lastIndexOf('.');
        if(y-x==6)
        {
          String s1=s.substring(0, x);
          int l1=s1.length();
          if(l1>=3)
          {
            System.out.println("EMAIL IS VALID");
          } 
          
          
          
        }
      }
    }
    
    System.out.println("NOT VALID");
  }
}
