class Solution {
    public String solution(String code) {
        String answer = "";
        boolean mode = true;
        
        for(int i=0;i<code.length();i++){
            char character = code.charAt(i);
            if(character=='1'){
                mode = !mode;
                continue;
            }
            if(mode && i%2==0){
                answer = answer + character;
            }
            if(!mode && i%2==1){
                answer = answer + character;
            }
            
        }
        
        if(answer.isEmpty()){
            answer = "EMPTY";
        }
        
        return answer;
    }
}