class Solution {
    public int[] solution(long n) {
        String m = String.valueOf(n);
        int[] answer = new int[m.length()];
        int a = 0;
        while(n>0){
            answer[a] =Long.valueOf((long)n%10).intValue();
            n/=10;
            a++;
        }
        return answer;
    }
}