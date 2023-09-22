import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count = 0;
        int zero = 0;

        List<Integer> list = new ArrayList<>();
        for (int num : win_nums) {
            list.add(num);
        }
        
        for(int i=0;i<lottos.length;i++){
            if(list.contains(lottos[i])){
                count++;
            }
            if(lottos[i]==0){
                zero++;
            }
        }
        System.out.println(count);
        answer[0] = 7-zero-count;
        answer[1] = 7-count;
        if(answer[0] == 7){
            answer[0] = 6;
        }
        if(answer[1] == 7){
            answer[1] = 6;
        }
        return answer;
    }
}