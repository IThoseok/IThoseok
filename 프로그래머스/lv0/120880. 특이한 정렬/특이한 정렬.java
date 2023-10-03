import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        Map<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());
        
        for(int num : numlist){
            map.put(num, Math.abs(num-n));
        }
        
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort(Map.Entry.comparingByValue());

        int i=0;
        for (Map.Entry<Integer, Integer> entry : entryList) {
            if(i==answer.length){
                break;
            }
            answer[i] =entry.getKey();
            i++;
        }
        
        return answer;
    }
}