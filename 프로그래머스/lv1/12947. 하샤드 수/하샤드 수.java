class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int x2 = x;
        int tot = 0;
        while(x>0){
           tot+=x%10;
            x/=10;
        }
        if(x2%tot==0){
            answer=true;
        }
        return answer;
    }
}