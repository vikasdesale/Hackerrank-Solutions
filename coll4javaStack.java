import java.util.*;
class Solution{
   
   public static void main(String []argh)
   {
      Scanner sc = new Scanner(System.in);
 
    while (sc.hasNext()) {
        String input = sc.next();
        //Complete the code
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < input.length(); i++) {
            if (stack.isEmpty()) {
                stack.add(input.charAt(i));
            } else if (stack.peek() != null) {
                Character c = stack.peek();
                Character currEle = input.charAt(i);

                int charInt = c - 0;
                int currInt = currEle - 0;
                int diffInt = currInt - charInt;

                if ((currEle == '(' || currInt == '[' ||                                  currInt == '{')) {
                    stack.add(currEle);
                } else {
                    if (diffInt > 0 && diffInt <= 2)
                        stack.pop();
                }

            }
        }
        System.out.println(stack.size() % 2 == 1 ?                            "false":"true");
      }
      
   
   }
}
