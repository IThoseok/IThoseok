class Solution {
    public String solution(String s) {
        String answer = "";
        String before = "";
        for(char x : s.toCharArray()){

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