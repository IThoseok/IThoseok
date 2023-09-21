import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        String[] Alphabet = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String key : keymap){
            for(String str : Alphabet){
                if(key.indexOf(str)!=-1){
                    map.merge(str, key.indexOf(str)+1, (existingValue, newValue) -> Math.min(existingValue, newValue));
                }
            }
        }
        
        for (int i = 0; i < targets.length; i++) {
            for (int j = 0; j < targets[i].length(); j++) { 
                String letter = targets[i].substring(j, j + 1);
                answer[i] += map.getOrDefault(letter, 0);
                if(map.get(letter)==null){
                    answer[i] = -1;
                    break;
                }
            }
        }
        System.out.println(map.get("A"));
        
        
        return answer;
    }
}