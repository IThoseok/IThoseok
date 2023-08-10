class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int tmp = 0;
        int tmp2 = 0;
    
        for(int i=0;i<sizes.length;i++){
            //일단 매 배열마다 비교해서 큰거를 tmp에 넣고 걔는 0으로 바꿔줌
            if(sizes[i][0]>sizes[i][1]){
                if(sizes[i][0]>tmp){
                    tmp = sizes[i][0];
                }
                sizes[i][0] = 0;
            }else {
                if(sizes[i][1]>tmp){
                    tmp = sizes[i][1];
                }
                sizes[i][1] = 0;
            }
            //그러면 이제 0과 나머지 작은수들 남지?
            //또 작은수들중에 큰거를 tmp2에 넣고 0으로 바꿔주기 반복
            //tmp곱tmp2 끝
            //
        }
        
        for(int i=0;i<sizes.length;i++){

            if(sizes[i][0]>sizes[i][1]){
                if(sizes[i][0]>tmp2){
                    tmp2 = sizes[i][0];
                }
                sizes[i][0] = 0;
            }else {
                if(sizes[i][1]>tmp2){
                    tmp2 = sizes[i][1];
                }
                sizes[i][1] = 0;
            }

        }
        
        
        
        return tmp*tmp2;
    }
}