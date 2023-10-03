class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        
        int[][] Array = new int[numbers.length+1][];

        // 각 행에 배열 할당 
        Array[0] = new int[] {0};
        for(int i=1;i<=numbers.length;i++){
            Array[i] = new int[(int)Math.pow(2, i)];
            for (int j=0; j<Array[i].length; j++){
                if(j%2==0){ //짝수, 플러스
                    Array[i][j] = Array[i-1][j/2] + numbers[i-1];
                }else{//홀수, 마이너스
                    Array[i][j] = Array[i-1][j/2] - numbers[i-1];
                }
                if(i==numbers.length && Array[i][j]==target){
                    answer++;
                }
            }
        }

        
        
        
        
        
        return answer;
    }
}