class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int length = 0;
        
        if(s.equals("")){
            return false;
        }
        
        s = s.replace("()", "");
        if(s.equals("")){
            return true;
        }
        
        if(s.length()%2==1 ){ 
            return false;
        }
        
        if(s.indexOf("(",s.length()-1) != -1){
            return false;
        }
        
        if(s.indexOf("(",0) == -1){
            return false;
        }
        
        length = s.length();
        if(length != s.replace(String.valueOf(')'),"").length()*2){
            return false;
        }

        return answer;
    }
}