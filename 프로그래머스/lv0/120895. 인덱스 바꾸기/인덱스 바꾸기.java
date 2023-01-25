class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char a ;
        char b ;
        char[] chars = my_string.toCharArray();
        a = chars[num1];
        b = chars[num2];
        chars[num2] = a;
        chars[num1] = b;
        answer = String.valueOf(chars);
        return answer;
    }
}