import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {-1};
        String ans = "";
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]%divisor==0){
                ans+=arr[i]+"a";
            }
        }
        if(ans.equals("")){
            return answer;
        }
        String[] str = ans.split("a");

        return Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
    }
}