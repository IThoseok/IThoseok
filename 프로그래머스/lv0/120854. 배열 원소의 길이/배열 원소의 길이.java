class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = {};
        int a = strlist.length;
        answer = new int[a];
         a = 0;
        
        for(String s : strlist){
            answer[a] = s.length();
            a++;
        }
        return answer;
    }
}