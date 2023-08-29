import java.util.Arrays;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        int[] arr = new int[k];
        for(int i=0;i<score.length;i++){
            for(int j=0;j<k;j++){
                if(score[i]>arr[j]){
                    arr[j] = score[i];
                    Arrays.sort(arr);
                    if(i<k-1){
                        answer[i] = arr[k-i-1];
                    }else{
                        answer[i] = arr[0];
                    }
                    break;
                }else{
                    answer[i] = arr[0];
                }
                
                
            }
        }
        return answer;
    }
}