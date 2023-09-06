import java.util.Arrays;
import java.util.Collections;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Integer[] arr = Arrays.stream(citations).boxed().toArray(Integer[]::new);

        Arrays.sort(arr, Collections.reverseOrder());
        
        for(int i=0;i<arr.length;i++){
            if(i+1<=arr[i]){
                answer = i+1;
            }
        }
        
        return answer;
    }
}