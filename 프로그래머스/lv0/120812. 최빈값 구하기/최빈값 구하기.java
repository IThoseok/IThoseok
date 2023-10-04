import java.util.*;
import java.util.Map.Entry;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Map<Integer, Integer> map = new TreeMap<>();
        
        for(int num : array){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        List<Entry<Integer, Integer>> sortedList = new ArrayList<>(map.entrySet());
        sortedList.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
        
        int value = 0;
        for (Entry<Integer, Integer> entry : sortedList) {
            if(value==entry.getValue()){
                return -1;
            }else if(value<entry.getValue()){
                answer = entry.getKey();
                value = entry.getValue();
            }
        }
        
        return answer;
    }
}