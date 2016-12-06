import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a []=new int[n];
    int count=0;
    for(int i=0; i<n; i++){
        a[i]=sc.nextInt();
    }

    for(int i=0; i<n; i++){
        int m=i;
        int sum=0;
        for(int j=i; j<=m; j++){
            sum+=a[j];
            if(sum<0) count++;
            if(m<n-1) m++;
        }
    }
    System.out.println(count);   
    }
}