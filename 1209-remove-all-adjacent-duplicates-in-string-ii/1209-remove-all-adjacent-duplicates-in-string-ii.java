import java.util.*;



    class Solution {

      static class Pair {
        char ch;
        int count;

        Pair(char ch, int count) {
            this.ch = ch;
            this.count = count;
        }
    }



    public String removeDuplicates(String s, int k) {
         int n= s.length();

        Stack<Pair> stack = new Stack<>();

         for(int i=0;i<n;i++){
            char ch = s.charAt(i);
             if(stack.isEmpty()){
                stack.push(new Pair(ch, 1));
               
               continue;
             }
              if (stack.peek().ch != ch) {
                stack.push(new Pair(ch, 1));
                continue;
            }
              stack.peek().count++;


               if (stack.peek().count == k) {
                stack.pop();
            }

         }


         StringBuilder str = new StringBuilder();

          while (!stack.isEmpty()) {
            Pair p = stack.pop();

            // ✅ FIXED: append correctly
            for (int i = 0; i < p.count; i++) {
                str.append(p.ch);
            }

            

        }

         return str.reverse().toString();
         
    }
    }