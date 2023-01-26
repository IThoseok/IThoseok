class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        for(int i=0;i<emergency.length;i++){
            int a = emergency.length;
            for(int j=0;j<emergency.length;j++){
                if(j==i){
                    continue;
                }else if(emergency[i]>emergency[j]){
                    a--;
                }
            }
            answer[i] = a;
        }
        return answer;
    }
}