class Solution {
    public String solution(String s) {
        String answer = "";
        String before = "";
        for(char x : s.toCharArray()){
            if(x>48 && x<57){//숫자패스
                before = Character.toString(x);
                answer += Character.toString(x);
                continue;
            }
            if(before.length() == 0 || before.equals(" ")){//공백다음 or 첫글자
                answer += Character.toUpperCase(x);
                before = Character.toString(x);
            }else { //소문자 변환
                answer += Character.toLowerCase(x);
                before = Character.toString(x);
            }
            
        }
        return answer;
    }
}