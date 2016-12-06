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
        if((A.compareTo(B))>0)
     {
         System.out.println("Yes");
     }
    else
    {
        System.out.println("No");
    }
            String m=Character.toString(A.charAt(0)).toUpperCase()+A.substring(1);
          String n=Character.toString(B.charAt(0)).toUpperCase()+B.substring(1);
       System.out.println(
                         m+" "+n);

    }
}
