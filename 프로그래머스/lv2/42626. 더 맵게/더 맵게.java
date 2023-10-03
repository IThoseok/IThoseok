import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        
        for(int food : scoville){
            queue.add(food);
        }
        
        while(!queue.isEmpty()){
            if(queue.peek()>=K){
                break;
            }else if(queue.size()==1&&queue.peek()<K){
                return -1;
            }
            int food1 = queue.poll();
            int food2 = queue.poll();
            queue.add(food1+(food2*2));
            answer++;
        }

        
        return answer;
    }
}