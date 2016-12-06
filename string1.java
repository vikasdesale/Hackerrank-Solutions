import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int x=A.length();
        int y=B.length();
        System.out.println(x+y);
        int g=A.charAt(0);
        int h=B.charAt(0);

        if( g>h){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
         String m=Character.toString(A.charAt(0)).toUpperCase()+A.substring(1);
          String n=Character.toString(B.charAt(0)).toUpperCase()+B.substring(1);
       System.out.println(
                         m+" "+n);
        
        
    }
}