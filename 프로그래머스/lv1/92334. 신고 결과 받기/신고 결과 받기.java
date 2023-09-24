import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashSet<String> set = new HashSet<>();
        Map<String, Integer> reportedMap = new HashMap<>();
        Map<String, List<String>> map = new HashMap<>();
        
        for(String id : id_list){
            map.put(id, new ArrayList<>());
        }
        for(String str : report){
            set.add(str);
        }
        
        for(String reported : set){
            String reporterId = reported.substring(0, reported.indexOf(' '));
            String reportedId = reported.substring(reported.indexOf(' ') + 1);
            reportedMap.put(reportedId, reportedMap.getOrDefault(reportedId, 0) + 1);
            map.get(reporterId).add(reportedId);
        }
        for(int i=0;i<id_list.length;i++){
            int count =0;
            for(String id: map.get(id_list[i])){
                if(reportedMap.get(id)>=k){
                    count++;
                }
            }
            answer[i] = count;
        }
        
        return answer;
    }
}