class Solution {
    public String solution(int age) {
        String answer = "";
        //answer += Character.toString((char)(((int)age/1000)+97));
        if(age==1000){
            answer += "baaa";
            return answer;
        }
        if(age/100>0){
         answer += Character.toString((char)(((int)age/100%100)+97));   
        }
        if(age/10>0){
         answer += Character.toString((char)(((int)age/10%10)+97));   
        }
        answer += Character.toString((char)(((int)age%10)+97));
        //answer += Character.toString((char)(((int)age/1000)+64));
        return answer;
    }
}