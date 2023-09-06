import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        ArrayList<String> list = new ArrayList<>(Arrays.asList(discount));
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(int i=0;i<want.length;i++){
            map.put(want[i],number[i]);
        }
        
        for (int i = 0; i <= list.size() - 10; i++) {
            boolean a = true;
            List<String> subList = new ArrayList<>(list.subList(i, i + 10));
            Set<String> set = new HashSet<String>(subList);
            for (String str : map.keySet()) {
                if (Collections.frequency(subList, str) < map.get(str)) {
                    a = false;
                    break;
                }
            }
            if (a) {
                answer++;
            }
        }
        
        return answer;
    }
}