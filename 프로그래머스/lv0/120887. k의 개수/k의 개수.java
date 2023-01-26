class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        while(i<=j){
            String a = i+"";
            String b = k+"";
            String[] mobNum = a.split("");
            for(String c : mobNum){
                if(c.equals(b)){
                    answer++;
                }
            }
            i++;
        }
        return answer;
    }
}