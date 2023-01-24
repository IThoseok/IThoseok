import java.util.Arrays;
class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        my_string = my_string.replaceAll("[^0-9]", "");
        answer= new int[my_string.length()];
        String[] array = my_string.split("");
        int n = 0;
        while(n<my_string.length()){
            answer[n] = Integer.parseInt(array[n]);
            n++;
        }
        Arrays.sort(answer);
        return answer;
    }
}