class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        String tmp = "";
        //String[] strArray = s.split("");
        
        for(int i=0;i<s.length();i++){
            if(tmp.lastIndexOf(Character.toString(s.charAt(i)))==-1){
                answer[i] = -1;
            }else{
                answer[i] = tmp.length() - tmp.lastIndexOf(Character.toString(s.charAt(i)));
            }
            tmp += Character.toString(s.charAt(i));
        }
        
        
        return answer;
    }
}