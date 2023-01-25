class Solution {
    public int solution(int n) {
        int answer = 0;
        int a = 2;
        int b = 1;
        int c = 0;
        while(a<=n){
            b=1;
            c=0;
            while(b<=a){
                
                if(a%b == 0){
                    c++;
                }
                if(c==3){
                    answer+=1;
                    break;
                }
                b++;
            }
            a++;
        }
        return answer;
    }
}