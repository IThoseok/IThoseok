import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for(int i=l;i<=r;i++){
            String numberStr = Integer.toString(i);
            Pattern pattern = Pattern.compile(".*[12346789].*");
            Matcher matcher = pattern.matcher(numberStr);
            if(!matcher.matches()){
                list.add(i);
            }
        }
        if(list.isEmpty()){
            return new int[]{-1};
        }else{
            answer = list.stream()
                                       .mapToInt(Integer::intValue)
                                       .toArray();
        }
        return answer;
    }
}