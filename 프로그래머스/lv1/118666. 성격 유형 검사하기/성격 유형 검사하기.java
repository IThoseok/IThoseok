import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=0;i<survey.length;i++){
            if(choices[i]<4){
                String type = survey[i].substring(0, 1);
                map.put(type, map.getOrDefault(type, 0) + 4-choices[i]);
            }else if(choices[i]>4){
                String type = survey[i].substring(1);
                map.put(type, map.getOrDefault(type, 0) + choices[i]-4);
            }
        }
        
        if(map.getOrDefault("R", 0)>=map.getOrDefault("T", 0)){
            answer = answer + "R";
        }else{
            answer = answer + "T";
        }
        
        if(map.getOrDefault("C", 0)>=map.getOrDefault("F", 0)){
            answer = answer + "C";
        }else{
            answer = answer + "F";
        }
        
        if(map.getOrDefault("J", 0)>=map.getOrDefault("M", 0)){
            answer = answer + "J";
        }else{
            answer = answer + "M";
        }
        
        if(map.getOrDefault("A", 0)>=map.getOrDefault("N", 0)){
            answer = answer + "A";
        }else{
            answer = answer + "N";
        }
        
        
        
        return answer;
    }
}