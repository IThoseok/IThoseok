class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        answer[0] = numer1*denom2 +numer2*denom1;
        answer[1] = denom2*denom1;
        for(int i=2;i<=Math.min(answer[0], answer[1]);i++){
            if(answer[1]%i==0 && answer[0]%i==0){
                answer[1] /= i;
                answer[0] /= i;
                i--;
            }
        }
        return answer;
    }
}