class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];

        for(int i=1;i<=n;i++){
            answer[0][i-1] = i;
        }
        
        int j = 0;
        int k = n-1;
        int cnt = n-1;
        int tmp = 0;
        int rotation = 1;
        
        for(int i=n+1;i<=n*n;i++){
            if(rotation==1){
                j++;
                answer[j][k] = i;
                tmp++;
            }
            if(rotation==2){
                k--;
                answer[j][k] = i;
                tmp++;
            }
            if(rotation==3){
                j--;
                answer[j][k] = i;
                tmp++;
            }
            if(rotation==4){
                k++;
                answer[j][k] = i;
                tmp++;
            }
            
            if(tmp==cnt){
                tmp = 0;
                if(rotation%2==0){
                    cnt--;
                }
                rotation++;
                if(rotation==5){
                    rotation = 1;
                }
            }
            
            
        }
        

        
        
        
        
        
        
        return answer;
    }
}