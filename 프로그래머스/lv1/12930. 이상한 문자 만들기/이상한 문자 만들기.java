class Solution {
    public String solution(String s) {
        String answer = "";
        int cnt = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                answer+=" ";
                cnt = 0;
                continue;
            }
            if(cnt%2==0){
                answer+=String.valueOf((char)(s.charAt(i))).toUpperCase();
            }
            if(cnt%2==1){
                answer+=String.valueOf(s.charAt(i)).toLowerCase();
            }
            cnt++;
            
        }
        return answer;
    }
}