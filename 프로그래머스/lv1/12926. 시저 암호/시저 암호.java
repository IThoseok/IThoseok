class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] chs = s.toCharArray();
        char ch = 0;
        for(int i=0;i<chs.length;i++){
            if(chs[i]==' '){answer+=" "; continue;}
            ch = (char)((int)chs[i]+n);
            //대문자
            if(chs[i]<91 && ch<91){
                answer += String.valueOf((char)(ch));
            }else if(chs[i]<91 && ch>=91){
                answer += String.valueOf((char)(ch-26));
            }
            //소문자
            if(chs[i]>96 && ch<123){
                answer += String.valueOf((char)(ch));
            }else if(ch>=123){
                answer += String.valueOf((char)(ch-26));
            }
           
        }
        return answer;
    }
}