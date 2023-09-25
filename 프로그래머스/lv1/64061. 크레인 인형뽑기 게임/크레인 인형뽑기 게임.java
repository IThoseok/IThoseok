import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Map<Integer, Stack<Integer>> map = new HashMap<>();
        
        for(int i=board.length-1;i>=0;i--){
            for(int j=0;j<board[i].length;j++){
                if(i==board.length-1){
                    map.put(j+1, new Stack<>());
                }
                if(board[i][j]!=0){
                    map.get(j+1).push(board[i][j]);
                }
            }
        }
        System.out.println(map.get(5));
        Stack<Integer> basket = new Stack<>();
        
        for(int move : moves){
            if(!map.get(move).isEmpty()){
                int doll = map.get(move).pop();
                if(!basket.isEmpty()){
                    if(basket.peek()==doll){
                        basket.pop();
                        answer+=2;
                        continue;
                    }
                }
                basket.push(doll);
            }
        }
        
        return answer;
    }
}