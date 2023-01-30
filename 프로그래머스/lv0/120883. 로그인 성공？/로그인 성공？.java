class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        for(String[] a : db){
            if(id_pw[0].equals(a[0])){
                answer="wrong pw";
                if(id_pw[1].equals(a[1])){
                    answer="login";
                    return answer;
                }
            }
        }
        return answer;
    }
}