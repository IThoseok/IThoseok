import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> sumArr = new ArrayList<>();
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int temp = numbers[i] + numbers[j];
                if(sumArr.indexOf(temp) < 0){
                    sumArr.add(temp);
                }
            }
        }


        int[] answer = new int[sumArr.size()];
        int i = 0;
        for (int num : sumArr) {
            answer[i++] = num; 
        }

        Arrays.sort(answer);
        return answer;
    }
}