import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        for (int i = 0; i < cities.length; i++) {
            cities[i] = cities[i].toLowerCase();
        }
        LinkedList<String> list = new LinkedList<>();
        for(String city : cities){
            if(list.contains(city)){
                list.remove(city);
                answer ++;
            }else{
                answer += 5;
            }
            
            list.addFirst(city);
            if(list.size()>cacheSize){
                list.removeLast();
            }
        }
        
        return answer;
    }
}