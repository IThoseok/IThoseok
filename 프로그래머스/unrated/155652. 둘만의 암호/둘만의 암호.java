import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        ArrayList<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"));
        for (int j = 0; j < skip.length(); j++) { 
            String letter = skip.substring(j, j + 1);
            list.remove(letter);
        }
            
        for (int j = 0; j < s.length(); j++) { 
            String letter = s.substring(j, j + 1);
            int index2 = list.indexOf(letter)+index;
            answer += list.get(index2%list.size());
        }
        
        
        
        return answer;
    }
}