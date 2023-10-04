class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        for(int i=0;i<A.length();i++){
            if(A.equals(B)){
                return answer;
            }
            char last = A.charAt(A.length() - 1);
            
            String rest = A.substring(0, A.length() - 1);
            
            A = last + rest;
            
            answer++;
        }
        
        return -1;
    }
}