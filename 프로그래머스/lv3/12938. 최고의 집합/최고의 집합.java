import java.util.*;

class Solution {
    public int[] solution(int n, int s) {
        int[] answer = {};
        if(n>s){
            return new int[] {-1};
        }else{
            answer = new int[n];
            for(int i=0;i<answer.length;i++){
                answer[i] = s/n;
            }
            for(int i=s%n;i>0;i--){
                answer[i]++;
            }
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}