class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        n=0;
        for(int num : section){
            if(n<num){
                answer++;
                n = num+m-1;
            }
        }
        
        
        
        return answer;
    }
}