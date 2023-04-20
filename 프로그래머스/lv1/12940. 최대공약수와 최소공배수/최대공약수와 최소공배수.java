class Solution {
    public int[] solution(int n, int m) {
        Long max =0L;
        Long min =0L;
        
        if(n<m){
             min = Long.valueOf(n);
             max = Long.valueOf(m);
        }else{
             min = Long.valueOf(n);
             max = Long.valueOf(m);
        }
        Long max2 = max*min;
        int[] answer ={1, max2.intValue()};
        if(max%min==0){
            answer[0] = min.intValue();
            answer[1] = max.intValue();
         return answer;
        }
        
        for(Long i=min;i>=2L;i--){
            if(max%i==0 && min%i==0){
                answer[0] = i.intValue();
                max2 = (min/i)*max;
                answer[1] = max2.intValue();
               // ((min/i)*max).intValue();
               return answer;
            }
        }

        
        return answer;
    }
}