import java.util.Arrays;
class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length()==4 || s.length()==6){
            for(char a : s.toCharArray()){
                if(65<=a && a<=90 ){return false;}
                if( 97<=a && a<=122){return false;}
            }
            return true;
        }else{return false;}

    }
}