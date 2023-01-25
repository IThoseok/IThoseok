class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] a = letter.split(" ");
        String[] c = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(String b : a){
            int i = 0;
            while(i<c.length){
               if(b.equals(c[i])){
                answer+=String.valueOf((char)(i+65)).toLowerCase();
                } 
                i++;
            }
            
        }
        return answer;
    }
}