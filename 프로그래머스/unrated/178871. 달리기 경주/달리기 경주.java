import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        //String[] answer = {};
        Map<Integer, String> map = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        int rank = 1;
        for(String player : players){
            map.put(rank, player);
            map2.put(player, rank);
            rank++;
        }
        
        for(String call : callings){
            rank =map2.get(call); //기존등수
            String up = map.get(rank);
            String donw = map.get(rank-1);
            map2.put(up, rank-1);
            map2.put(donw, rank);
            
            
            //map.remove(rank-1);
            map.put(rank-1, up);
            map.put(rank, donw);
            
        }
        Collection<String> valuesCollection = map.values();
        String[] answer = valuesCollection.toArray(new String[0]);
        
        return answer;
    }
}