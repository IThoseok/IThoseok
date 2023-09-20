import java.util.*;
import java.util.Collections;

class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        HashMap<Character, Integer> xMap = new HashMap<>();
        HashMap<Character, Integer> yMap = new HashMap<>();

        ArrayList<Character> xList = new ArrayList<>();
        ArrayList<Character> yList = new ArrayList<>();

        for (char c : X.toCharArray()) {
            xList.add(c);
        }
        for (char c : Y.toCharArray()) {
            yList.add(c);
        }

        for (char i = '0'; i <= '9'; i++) {
            if (X.indexOf(i) != -1 && Y.indexOf(i) != -1) {
                xMap.put(i, Collections.frequency(xList, i));
                yMap.put(i, Collections.frequency(yList, i));
            }
        }

        for (char i = '9'; i >= '0'; i--) {
            int xCount = xMap.getOrDefault(i, 0);
            int yCount = yMap.getOrDefault(i, 0);
            for (int j = 0; j < Math.min(xCount,yCount); j++) {
                answer.append(i);
            }
        }
         
        if (answer.length() == 0) {
            return "-1";
        } else if (answer.toString().replaceAll("0", "").isEmpty()) {
            return "0";
        }

        return answer.toString();
    }
}