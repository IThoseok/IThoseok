class Solution {
    public int solution(int n) {
        int answer = 0;
        int a = 1;
        while(a<=100){
            if((6*a)%n==0){
                answer = a;
               break;
            }a++;
        }
         return answer;
    }
}