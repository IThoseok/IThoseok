import java.util.*;
class Solution {
    public int[] solution(String s) {
        
        
        s = s.substring(1, s.length() - 1);
        
        List<String> listOfArrays = new ArrayList<>();
        
        String[] arr = s.split("},");
        
        for(String str : arr){
            listOfArrays.add(str.replace("{", "").replace("}", ""));
        }
        listOfArrays.sort(Comparator.comparingInt(str -> str.length()));

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        for(String str : listOfArrays){
            if(str.contains(",")){
                String[] parts = str.split(",");
                for(String part : parts){
                    if(!linkedHashSet.contains(part)){
                        linkedHashSet.add(part);
                    }
                }
            }else{
                linkedHashSet.add(str);
            }
        }
        
        
        
        
        int[] answer = new int[listOfArrays.size()];
        int idx = 0;
        for(String str : linkedHashSet){
            answer[idx] = Integer.parseInt(str);
            idx++;
        }
        
        return answer;
    }
}