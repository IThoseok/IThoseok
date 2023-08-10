class Solution {
    public int solution(int n) {
        long answer = 1L;
        long tmp = 0L;
        long tmp2 = 1L;
        for(int i=2;i<=n;i++){
            answer = (tmp+tmp2)%1234567L;
            tmp = tmp2;
            tmp2 = answer;
        }
        
        return Long.valueOf(answer).intValue();
    }
}