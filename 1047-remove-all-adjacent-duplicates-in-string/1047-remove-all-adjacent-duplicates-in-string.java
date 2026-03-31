class Solution {
    public String removeDuplicates(String s) {
        int n=s.length();
        Stack <Character> stack=new Stack<>();
        
        for(int i=0;i<n;i++){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
                continue;
            }
            if(stack.peek()==s.charAt(i)){
              stack.pop();
              continue;
            }
            stack.push(s.charAt(i));

           

        }

        StringBuilder str =new StringBuilder();
       
        while(! stack.isEmpty()){
             str.append(stack.peek());
             stack.pop();

            }

            str= str.reverse();

         return str.toString();
    }
}