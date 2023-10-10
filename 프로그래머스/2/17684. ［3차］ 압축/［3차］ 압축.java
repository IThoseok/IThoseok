import java.util.*;
class Solution {
    private static LinkedList<Integer> indexList = new LinkedList<>();
    private static LinkedList<Map<String, Integer>> mapList = new LinkedList<>();
    private static int cnt = 0;
    public int[] solution(String msg) {
        
        char alphabet = 'A';

        Map<String, Integer> dic = new HashMap<>();
        for (int i = 1; i <= 26; i++) {
            String letter = String.valueOf(alphabet);
            dic.put(letter, i);
            alphabet++;
            cnt = i;
        }
        mapList.add(dic);
        
        addDic(msg, mapList);
        
        int[] answer = new int[indexList.size()];
        for(int i=0;i<answer.length;i++){
            answer[i] = indexList.get(i);
        }
        
        return answer;
    }
    private static void addDic(String str, LinkedList<Map<String, Integer>> mapList){
        if(str.isEmpty()){
            return;
        }
        for (int i = mapList.size() - 1; i >= 0; i--) {
            Map<String, Integer> map = mapList.get(i);
            Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

            for (Map.Entry<String, Integer> entry : entrySet) {
                String key = entry.getKey();
                Integer value = entry.getValue();
                if(str.startsWith(key)){
                    indexList.add(value);
                    if(mapList.size()<=key.length()){
                        mapList.add(new HashMap<>());
                    }
                    if(str.length()>key.length()){
                        mapList.get(key.length()).put(str.substring(0, key.length()+1), cnt+1);
                    }
                    
                    cnt++;
                    //addDic(str.substring(key.length()), mapList);
                    addDic(str.substring(key.length()), new LinkedList<>(mapList));
                    return;
                }
            }
            //System.out.println(mapList);
        }
        
    }
  
}