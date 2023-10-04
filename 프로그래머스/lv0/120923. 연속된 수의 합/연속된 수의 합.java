class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int [num];
        for(int i=0;i<answer.length;i++){
            if(num%2!=0){
                answer[i] = total/num -num/2 +i;
            }else{

                answer[i] = (total/(num/2) - (num-1))/2 +i;
            
            }
        }
        
        return answer;
    }
}