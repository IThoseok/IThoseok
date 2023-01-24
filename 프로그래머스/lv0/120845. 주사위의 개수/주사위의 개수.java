class Solution {
    public int solution(int[] box, int n) {
        int answer = box[0];
        for(int a : box){
            answer *= (int)a/n;
        }
        answer = answer/box[0];
        return answer;
    }
}