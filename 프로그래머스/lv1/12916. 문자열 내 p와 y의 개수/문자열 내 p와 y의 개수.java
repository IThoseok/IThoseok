class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int cnt = 0;
        int cnt2 = 0;
        String[] a = s.split("");
        for(String b : a){
            if(b.equals("y") || b.equals("Y")  ){
                cnt++;
            }else if (b.equals("p") || b.equals("P")){
                cnt2++;
            }
        }
        if(cnt2 != cnt){
            answer = false;
        }
        return answer;
    }
}