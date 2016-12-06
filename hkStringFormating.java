import java.util.Scanner;


public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.printf("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                   String form=String.format("%03d",x);
             
                System.out.printf("\n%-15s%s",s1,form);
                //Complete this line
                
            }
        
            System.out.println("\n================================");

    }
}
