import java.util.*;
class Solution {
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static boolean[][] visited;
    static int[][] a;
    static int n;
    static int m;
    
    public int solution(int[][] maps) {
        int answer = 0;
        n = maps.length;
        m = maps[0].length;
        a = maps;
        visited = new boolean[n][m];
        BFS(0,0);
        answer = a[n-1][m-1];
        if(answer==1){
            return -1;
        }
        return answer;
    }
    private static void BFS(int i, int j){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {i, j});
        while(!queue.isEmpty()){
            int now[] = queue.poll();
            visited[i][j] = true;
            for(int k=0;k<4;k++){
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];
                if(x>=0 && y>=0 && x<n && y<m){//크기 
                    if(a[x][y]!=0 && !visited[x][y]){//장애물, 이미방문
                        visited[x][y] = true;
                        a[x][y] = a[now[0]][now[1]] +1;
                        queue.add(new int[] {x,y});
                    }
                }
            }
        }
    }
}