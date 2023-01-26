import java.util.StringTokenizer;
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[a-zA-Z]", " ");
         
        //my_string = my_string.replaceAll("-", " ");
        my_string = my_string.trim(); 
        String[] a = my_string.split(" ");
        for(String s : a){
            if(!s.equals("")){
                answer +=Integer.parseInt(s);
            }
            
        }
        return answer;
    }
}