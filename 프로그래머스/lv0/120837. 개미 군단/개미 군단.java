class Solution {
    public int solution(int hp) {
        int answer = 0;
        int a =0;
        int b =0;
        int c =0;
        a= (int)Math.floor(hp/5);
        b= (int)Math.floor((hp%5)/3);
        c= (int)Math.floor((hp%5)%3);
        answer= a+b+c;
        return answer;
    }
}