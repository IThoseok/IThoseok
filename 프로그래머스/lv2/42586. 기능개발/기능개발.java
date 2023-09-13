import java.util.*;

class Solution {
    public Integer[] solution(int[] progresses, int[] speeds) {
        int n = progresses.length;
        List<Integer> list = new ArrayList<Integer>();
        
        int[] daysToComplete = new int[n];

        
        for (int i = 0; i < n; i++) {
            daysToComplete[i] = (int) Math.ceil((100 - progresses[i]) / (double) speeds[i]);
        }

        int tmp = daysToComplete[0];
        int progress = 1;
        
        for (int i = 1; i < n; i++) {
            if (tmp < daysToComplete[i]) {
                tmp = daysToComplete[i];
                list.add(progress);
                progress = 1;
            } else {
                progress++;
            }
        }

        list.add(progress); 

        Integer[] answer = list.toArray(new Integer[0]);

        return answer;
    }
}