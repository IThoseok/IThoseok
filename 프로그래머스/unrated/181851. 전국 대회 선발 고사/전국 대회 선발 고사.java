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
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(list.size()==3){
                break;
            }
            int value = entry.getValue();
            list.add(value);
        }
        
        return list.get(0)*10000 + list.get(1)*100 + list.get(2);
    }
}