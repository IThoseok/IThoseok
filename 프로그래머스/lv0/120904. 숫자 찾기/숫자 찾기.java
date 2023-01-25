class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String a = num+"";
        String b = k+"";
        answer = a.indexOf(b)+1;
        if(a.indexOf(b)==-1){
            answer = -1;
        }
        return answer;
    }
}