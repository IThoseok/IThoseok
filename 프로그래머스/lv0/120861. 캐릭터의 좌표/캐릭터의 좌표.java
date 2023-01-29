class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        answer[0] =0;
        answer[1] =0;
       
        for(String a : keyinput){
            if(a.equals("up") && answer[1]<((board[1]-1)/2)){
                answer[1]++;
            }else if(a.equals("down") && -1*answer[1]<((board[1]-1)/2)){
                answer[1]--;
            }else if(a.equals("left") && -1*answer[0]<((board[0]-1)/2)){
                answer[0]--;
            }else if(a.equals("right") && answer[0]<((board[0]-1)/2)){
                answer[0]++;
            }
        }
        
        
        if(board[0]==1){
            answer[0] = 0;
        }else if(board[1]==1){
            answer[1] = 0;
        }
        return answer;
    }
}