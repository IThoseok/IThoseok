class Solution {
    public String solution(String[] seoul) {
        String answer1 = "김서방은 ";
        String answer2 = "에 있다";
        int cnt = 0;
        for(String kim : seoul){
            
            if(kim.equals("Kim")){
               return answer1+cnt+answer2; 
            }
            cnt++;
        }
        return answer1+cnt+answer2;
    }
}