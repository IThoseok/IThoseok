import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        HashMap<String, String> map = new HashMap<String, String>();
        
        for (String str : strings) {
            map.put(str.charAt(n) + str.substring(0, n) + str.substring(n + 1), str);
        }
        
        TreeMap<String, String> tm = new TreeMap<String, String>(map);
        Collection<String> valueset = tm.values();
        Iterator<String> iterator = valueset.iterator();
        
        for (int i = 0; iterator.hasNext(); i++) {
            answer[i] = iterator.next();
        }
        
        return answer;
    }
}