class Solution {
    public int solution(int n) {
        int answer = 0;
        int f = 1;
        for(int i=1;f<=n;i++){
            f*=i;
            answer = i-1;
             
        }
        return answer;
    }
}