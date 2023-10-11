import java.util.*;
class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        for(int work : works){
            list.add(work);
            sum += work;
        }
        if(sum<=n){
            return 0;
        }
        while(n>0){
            Collections.sort(list);
            int minus = (int)Math.ceil((double)n/(double)list.size());
            int max = list.get(list.size() - 1);
            list.set(list.size() - 1, max-minus);
            n -= minus;
            //System.out.println(minus);
        }
        
        for(int work : list){
            answer += work*work;
        }
        return answer;
    }
}