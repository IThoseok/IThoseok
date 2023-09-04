import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        Queue<String> que1 = new LinkedList<String>();
        Queue<String> que2 = new LinkedList<String>();
        
        for(String str : cards1){
            que1.add(str);
        }
        for(String str : cards2){
            que2.add(str);
        }
        
        for(String str : goal){
            if(que1.peek() != null && que1.peek().equals(str)){
                que1.poll();
            }else if(que2.peek() != null && que2.peek().equals(str)){
                que2.poll();
            }else{
                return "No";
            }
        }
        

        
        return answer;
    }
}