import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int a = 0;
        int b = 0;
        Arrays.sort(numbers);
        a = numbers[0]*numbers[1];
        b = numbers[numbers.length-1]*numbers[numbers.length-2];
        answer = b;
        if(a>b){
            answer= a;
        }
        return answer;
    }
}