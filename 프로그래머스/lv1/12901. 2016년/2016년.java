class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int[] months = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] week = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        
        for(int i=0;i<a-1;i++){
            b += months[i];
        }
        
        answer = week[b%7];
        
        
        
        
        return answer;
    }
}