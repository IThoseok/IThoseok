class Solution {
    public String solution(String rsp) {
        String answer = "";
        int a = 0;
        char ch;
        while(a<=rsp.length()-1){
            ch = rsp.charAt(a);
            if(String.valueOf(ch).equals("2")){
               answer += "0";
            }else if (String.valueOf(ch).equals("0")){
                answer += "5";
            }else{
                answer += "2";
            }
            a++;
        }
        
        return answer;
    }
}