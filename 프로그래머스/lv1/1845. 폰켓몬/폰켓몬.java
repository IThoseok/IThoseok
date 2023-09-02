import java.util.Arrays;

class Solution {
    public int solution(int[] nums) {
        int answer = nums.length/2;
        int cnt = 0;
        int tmp = 0;
        Arrays.sort(nums);
        
        for(int num : nums){
            if(tmp!=num){
                cnt++;
                tmp=num;
            }
        }
        
        if(nums.length/2 > cnt){
            answer = cnt;
        }
        
        return answer;
    }
}