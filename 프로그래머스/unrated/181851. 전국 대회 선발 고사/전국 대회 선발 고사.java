import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        Map<Integer, Integer> map = new TreeMap<>();
        
        for(int i=0;i<rank.length;i++){
            if(attendance[i]){
                map.put(rank[i], i);
            }
        }
        
        int num = 10000;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(num==0){
                break;
            }
            int value = entry.getValue();
            answer += value*num;
            num /= 100;

        }
        
        return answer;
    }
}