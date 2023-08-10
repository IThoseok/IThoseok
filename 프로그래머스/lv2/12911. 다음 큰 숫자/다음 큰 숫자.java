class Solution {
    public int solution(int n) {
        int answer = n;
        int cnt = 0;
        String s = Integer.toBinaryString(n);
        
    
        
        cnt = s.replace("0","").length(); //1의 개수
        
        for(int i=answer+1;i>answer;i++){
            int j = i;
            s = Integer.toBinaryString(j);
            //while(j>0){ //이진변환
            //s = String.valueOf(j%2)+s;
            //j/=2;
            //} 
            
            if(cnt == s.replace("0","").length()){
                return i;
            }
            
        }

        return answer;
    }
}