import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
     Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            boolean[] test = new boolean[n];
            for(int j=0;j<n;j++){
                test[j] = (sc.nextInt() == 1);
            }
            if(winnable(test, m)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
    public static boolean winnable(boolean[] test, int m){
        int currPos = 0;
        ArrayList<Integer> valid = validMoves(test, currPos, m);
        if(valid == null){
            return true;
        }
        while(valid.size() > 0){
            ArrayList<Integer> newValids = validMoves(test, valid.get(0), m);
            valid.remove(0);
            if(newValids == null){
                return true;
            }
            valid.addAll(newValids);
        }
        return false;
    }

    public static ArrayList<Integer> validMoves(boolean[] test, int currPos, int m){
        ArrayList<Integer> out = new ArrayList<Integer>();
        try{
            if(!test[currPos-1]){
                out.add(currPos-1);
                test[currPos-1] = true;
            }
        }catch(Exception e){

        }
        try{
            if(!test[currPos+1]){
                out.add(currPos+1);
                test[currPos+1] = true;
            }
            if(!test[currPos+m]){
                out.add(currPos+m);
                test[currPos+m] = true;
            }
        }catch(Exception e){
            return null;
        }
        return out;
    }
}