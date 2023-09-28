import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        
        str1 =str1.toLowerCase();
        str2 =str2.toLowerCase();
        
        for(int i=0;i<str1.length()-1;i++){
            char c = str1.charAt(i);
            char c2 = str1.charAt(i+1);
            if (Character.isLowerCase(c) && Character.isLowerCase(c2)) {
                list1.add(String.valueOf(c) + String.valueOf(c2));
            }
        }
        
        for(int i=0;i<str2.length()-1;i++){
            char c = str2.charAt(i);
            char c2 = str2.charAt(i+1);
            if (Character.isLowerCase(c) && Character.isLowerCase(c2)) {
                list2.add(String.valueOf(c) + String.valueOf(c2));
            }
        }
        
        
        List<String> union = new ArrayList<>(list1);
        union.addAll(list2);
        
        
        List<String> intersection = new ArrayList<>();
        for (String str : list1) {
            if (list2.contains(str)) {
                intersection.add(str);
                list2.remove(list2.indexOf(str));
            }
        }
        
        for (String str : intersection) {
            if (union.contains(str)) {
                union.remove(union.indexOf(str));
            }
        }
        
        if(union.size() == 0) return 65536;
        
        return intersection.size() * 65536 / union.size();
    }
}