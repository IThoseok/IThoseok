class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        int n = 1;
        while(n<=cipher.length()){
            if(n%code == 0){
                char ch = cipher.charAt(n-1);
                answer += String.valueOf(ch);
            }
            n++;
        }
        
        return answer;
    }
}