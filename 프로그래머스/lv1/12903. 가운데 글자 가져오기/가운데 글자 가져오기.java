class Solution {
    public String solution(String s) {

        while(1<s.length()){
         
            if(s.length()==2){
                return s;
            }
              s = s.substring(1,s.length()-1);
        }
        return s;
    }
}