import java.util.*;
import java.io.*;
import java.lang.*;
public class Alaphat{
public static void main(String args[]) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s=br.readLine();
int f=s.length();
        char[] s1=s.toCharArray();
for(int i=0;i<f;i++){
if(Character.isLetter(s1[i]))
System.out.println("Letter is Alphabet");
else 
System.out.println("Letter is not Alphabet");

}
}
}
