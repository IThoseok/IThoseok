import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        List<Integer> list = new ArrayList<>();
        
        for(int num : arr){
            list.add(num);
        }

        boolean front = true;
        for(int index : query){
            if(front){
                list.subList(index+1, list.size()).clear();
            }else{
                list.subList(0, index).clear();
            }
            front = !front;
        }
        
        int[] answer = list.stream()
        .mapToInt(Integer::intValue)
        .toArray();
        
        return answer;
    }
}