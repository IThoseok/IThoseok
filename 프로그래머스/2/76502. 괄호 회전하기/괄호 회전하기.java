import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        
        
        for(int i=0;i<s.length();i++){
            Stack<String> stack = new Stack<>();
            String str = (s+s).substring(i,i+s.length());

            String[] arr = str.split("");
            for(String part : arr){
                if(!stack.isEmpty()){
                    if((stack.peek()+part).equals("()")||(stack.peek()+part).equals("[]")||(stack.peek()+part).equals("{}")){
                        stack.pop();
                    }else{
                        stack.push(part);
                    }
                }else{
                    stack.push(part);
                }
            }
            if(stack.isEmpty()){
                answer++;
            }
            
        }
        
        return answer;
    }
}