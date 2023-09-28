import java.util.Collections;
import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        List<Integer> list = new ArrayList<>();
        for(String operation : operations){
            if(operation.contains("D") && list.size()!=0){
                if(operation.contains("-")){//최소
                    list.remove(list.indexOf(Collections.min(list)));
                }else{
                    list.remove(list.indexOf(Collections.max(list)));
                }
            }else{
                list.add(Integer.parseInt(operation.substring(2)));
            }
        }
        System.out.println(list);
        if(list.size()==0){
            return new int []{0,0};
        }else{
            answer[0] = Collections.max(list);
            answer[1] = Collections.min(list);
        }
        return answer;
    }
}