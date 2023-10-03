import java.util.*;
class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        Set<List<Integer>> set = new HashSet<>();
        int[][] arr = { {-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
        
        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board[i].length;j++) {
                if(board[i][j]==1){
                    List<Integer> combination = new ArrayList<>();
                    combination.add(i);
                    combination.add(j);
                    set.add(combination);
                    for(int k=0;k<8;k++){
                        if(i+arr[k][0]>=0 && i+arr[k][0]<board.length && j+arr[k][1]>=0 && j+arr[k][1]<board.length){
                            List<Integer> list = new ArrayList<>();
                            list.add(i+arr[k][0]);
                            list.add(j+arr[k][1]);
                            set.add(list);
                        }
                    }
                }
            }
        }
        
        
        return board.length*board.length - set.size();
    }
}