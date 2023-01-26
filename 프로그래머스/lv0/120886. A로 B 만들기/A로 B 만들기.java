import java.util.Arrays;
class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        char[] a = before.toCharArray();
        char[] b = after.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<a.length;i++){
            if(a[i] == b[i]){
                
            }else{
                answer=0;
                return answer;
            }
        }
        return answer;
    }
}