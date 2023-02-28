class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        for(int arr2 : arr){
            answer+=(double)arr2;
        }
        answer/=arr.length;
        return answer;
    }
}