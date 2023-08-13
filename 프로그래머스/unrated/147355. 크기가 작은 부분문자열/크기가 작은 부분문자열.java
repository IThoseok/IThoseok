class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int plength = p.length();
        int tlength = t.length();

        long pnum = Long.parseLong(p);
        
        for(int i=0;i<tlength-plength+1;i++){
            
            long tnum = Long.parseLong(t.substring(i,i+(plength)));
            
            if(tnum<=pnum){
                answer++;
            }
            
        }
        
        return answer;
    }
}