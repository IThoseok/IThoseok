class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        int[] answer2 = new int[score.length];
        //int a = score.length;
        for(int i=0;i<score.length;i++){
            answer[i]=score[i][0]+score[i][1];
        }
        for(int i=0;i<score.length;i++){
            int a = score.length;
            for(int j=0;j<score.length;j++){
                if(i!=j && answer[i]>=answer[j]){
                    a--;
                }
            }
            answer2[i]=a;
        }
        return answer2;
    }
}