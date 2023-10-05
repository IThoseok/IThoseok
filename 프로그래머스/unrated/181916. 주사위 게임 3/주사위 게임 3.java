import java.util.*;
import java.util.Map.Entry;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        
        map.put(a, map.getOrDefault(a, 0) + 1);
        map.put(b, map.getOrDefault(b, 0) + 1);
        map.put(c, map.getOrDefault(c, 0) + 1);
        map.put(d, map.getOrDefault(d, 0) + 1);
        //System.out.println(map);
        
        if(map.size()==1){
            return 1111 * a;
        }
        if(map.size()==4){
            return map.firstKey();
        }
        List<Entry<Integer, Integer>> sortedList = new ArrayList<>(map.entrySet());

        sortedList.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
        System.out.println(sortedList);
        if(map.size()==3){
            return sortedList.get(1).getKey() * sortedList.get(2).getKey();
        }
        
        if(sortedList.get(0).getValue()==3){
           return (int)Math.pow(sortedList.get(1).getKey() + (sortedList.get(0).getKey()*10), 2);
        }
        int aa = sortedList.get(0).getKey();
        int bb = sortedList.get(1).getKey();
        
        return  (aa + bb) * Math.abs(bb-aa);
    }
}