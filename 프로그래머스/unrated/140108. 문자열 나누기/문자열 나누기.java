class Solution {
    public int solution(String s) {
        int answer = 1;
        String tmp = Character.toString(s.charAt(0));
        int countX = 0;
        int countY = 0;
        
        for(int i=0;i<s.length()-1;i++){
            
            if(!tmp.equals(Character.toString(s.charAt(i)))){ //다른문자 카운팅
                
                countY++;
                if(countX == countY && countX != 0){
                    tmp = Character.toString(s.charAt(i+1)); 
                    countX = 0;
                    countY = 0;
                    answer++;
                }
            }else{ //같은 문자열 계속 카운팅
                countX++;
            }
        }
        return answer;
    }
}