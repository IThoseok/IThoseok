class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while (n >= a) {
            int cnt = n / a;
            n +=  cnt*(b-a);
            answer += cnt*b;
        }
        
        return answer;
    }
}