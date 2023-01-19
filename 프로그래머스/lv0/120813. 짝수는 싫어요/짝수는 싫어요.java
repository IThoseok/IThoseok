class Solution {
    public int[] solution(int n) {
        int a = 0;
        int[] answer = {};
        if(n%2==0){
            a=n/2;    
        }else{
            a= (n/2)+1;
        }
        answer = new int[a];
        for(int i=1;i<=a;i++){
            answer[i-1]=(2*i)-1;
        }
        return answer;
    }
}