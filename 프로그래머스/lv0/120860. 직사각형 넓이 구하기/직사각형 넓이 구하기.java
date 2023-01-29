import java.util.Arrays;
class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int[] a = new int[4];//가로
        int[] b = new int[4];//세로
        for(int i =0;i<4;i++){
            a[i]=dots[i][0];
            b[i]=dots[i][1];
        }
        Arrays.sort(a);
        Arrays.sort(b);
        answer=(a[0]-a[2])*(b[0]-b[2]);
        return answer;
    }
}