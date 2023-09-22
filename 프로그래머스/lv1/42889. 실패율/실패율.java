import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        Map<Integer, Integer> map = new TreeMap<>();
        int people = stages.length;
        
        for(int stage : stages){
            if(stage<=N){
                map.merge(stage, 1, (existingValue, newValue) -> existingValue + newValue);
            }
        }
        
        Map<Integer, Double> map2 = new HashMap<>();
        
        for(int i=1;i<=N;i++){
            double failureRate = (double) map.getOrDefault(i, 0) / people;
            if (people == 0) {
                failureRate = 0;
            }
            map2.put(i, failureRate);
            people -= map.getOrDefault(i, 0);
        }
        //List<Integer> keys = new ArrayList<>(map2.keySet());

        Set<Map.Entry<Integer, Double>> entrySet = map2.entrySet();
        List<Map.Entry<Integer, Double>> keys = new ArrayList<>(entrySet);
        keys.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
        
        
        int index = 0;
        for (Map.Entry<Integer, Double> entry : keys) {
            answer[index++] = entry.getKey();
        }
        
        //Collection<Double> values = map2.values();
       // int i=0;
        //for (Double value : values) {
        //    if(value!=N+1){
        //        answer[i] = value;
        //    i++;
        //    }
            
       // }
        
        
        return answer;
    }
}