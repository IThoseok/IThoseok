import java.util.*;
class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int [2];
        Map<String, int[]> map = new HashMap<>();
        map.put("N", new int[]{-1, 0});
        map.put("S", new int[]{1, 0});
        map.put("W", new int[]{0, -1});
        map.put("E", new int[]{0, 1});
        
        int w = park.length;
        int h = park[0].length();
        
        for (int i = 0; i < w; i++) {
            String str = park[i];
            for (int j = 0; j < h; j++) {
                if ('S' == str.charAt(j)) {
                    answer[0] = i;
                    answer[1] = j;
                    break; 
                }
            }
        }
        
        for (String route : routes) {
            String[] parts = route.split(" ");
            int[] direction = map.get(parts[0]);
            int number = Integer.parseInt(parts[1]);
            boolean isGo = true;
            int nextY = answer[0];
            int nextX = answer[1];
            for(int i=0;i<number;i++){
                nextY += direction[0];
                nextX += direction[1];
                if (nextX<0 || nextX>=h || nextY<0 || nextY>=w || park[nextY].charAt(nextX) == 'X') {
                    isGo = false;
                    break; 
                }
            }
            if(isGo){
                answer[0] = nextY;
                answer[1] = nextX;
                System.out.println(parts[0] + parts[1]);
            }
                
        }
        
        return answer;
    }
}