class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] a = s.split(" ");
        for(int i=0;i<a.length;i++){
            if(a[i].equals("Z")){
                answer-=Integer.parseInt(a[i-1]);
            }else if(!a[i].equals("0")){
                answer+=Integer.parseInt(a[i]);
            }
        }
        return answer;
    }
}