import java.util.*;
interface AdvancedArithmetic{
  public abstract int divisorSum(int n);
}

class MyCalculator implements AdvancedArithmetic{
public int divisorSum(int n){
    int j=0;
    // for getting required array size
    for(int i=1;i<=n/2;i++)
    {
        if(n%i==0)
        {
          j++;
        }

    }
    //filling up array
    int[] array=new int[j+1];
    int p=0;
    for(int i=1;i<=n/2;i++)
    {
        if(n%i==0)
        {
            array[p]=i;
            p++;
        }

    }
    //sum
    array[p]=n;
    int sum=0;
    for(int k=0;k<array.length;k++)
    {
        sum=sum+array[k];
    }
    return sum;
}

}

class Solution{

    public static void main(String []argh)
    {
        MyCalculator my_calculator=new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(my_calculator.divisorSum(n)+"\n");

    }
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o)
    {

        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++)
        {
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}

