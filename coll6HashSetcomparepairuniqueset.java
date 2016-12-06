import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc=new Scanner(System.in);
    HashSet<ArrayList<String>> hs=new HashSet<ArrayList<String>>();

    int t=sc.nextInt();
    for(int i=0;i<t;i++){
        ArrayList<String> temp=new ArrayList<String>();
        temp.add(sc.next());
        temp.add(sc.next());
        hs.add(temp);
        System.out.println(hs.size());
    }
    }
}