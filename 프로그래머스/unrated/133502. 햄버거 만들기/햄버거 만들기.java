import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        Stack<Integer> stack = new Stack<>();
        int answer =0;
        for (int c : ingredient) {
            if (stack.size()>2 && stack.peek() == 3 && c==1&& stack.elementAt(stack.size()-2)==2&& stack.elementAt(stack.size()-3)==1) {
                
                stack.pop();
                stack.pop();
                stack.pop();
                answer++;
            } else {
                stack.push(c);
            }
        }

        
        
        
        return answer;
    }
}