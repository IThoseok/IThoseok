class Solution {
    public int solution(int order) {
        int answer = 0;
        String a = order+"";
        String[] b = a.split("");
        for(String c : b){
            if(c.equals("3") || c.equals("6") || c.equals("9")){
                answer++;
            }
                
        }
        return answer;
    }
}