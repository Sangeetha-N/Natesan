import java.util.*;
import java.io.*;
import java.lang.*;
public class Vowel{
  public static void main(String args[]) throws IOException{
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String e=s.substring(0,1);
    String s1="aeiou";
  
    if(s1.contains(e)){
        System.out.println("Vowels");
      }
      else{
        System.out.println("Consnant");
      }
    }
  }


