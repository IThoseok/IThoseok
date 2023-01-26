import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String[] arr = s.split("");
        Arrays.sort(arr);
        String answer = String.join("",arr);
        for(String a : arr){
            int c = 0;
            for(String aa : arr){
                if(a.equals(aa)){
                    c++;
                }
            }
            if(c>1){
                answer = answer.replaceAll(a,"");
            }
        }
        return answer;
    }
}