import java.lang.Math.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i =2;i<=n;i++){
            boolean a = true;
                for(int j=2; j<=Math.sqrt(i);j++){
                    if(i%j==0){
                        a = false;
                        break;
                    }
                }
                if(a){
                    answer++;
                }
            
            
        }
        
        
        return answer;
    }
}