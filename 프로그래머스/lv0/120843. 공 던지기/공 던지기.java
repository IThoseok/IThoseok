class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int cnt = 0;
        for(int i=0;i<numbers.length*k;){
            if(cnt == k-1){
                answer = numbers[i%numbers.length];
                break;
            }
            cnt++;
            i += 2;
        }
        
        return answer;
    }
}