class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String a = "";
        for(int c : array){
            a+=c+"";
        }
        String[] a2 = a.split("");
        for(String a3 : a2){
            if(a3.equals("7")){
                answer++;
            }
        }
        return answer;
    }
}