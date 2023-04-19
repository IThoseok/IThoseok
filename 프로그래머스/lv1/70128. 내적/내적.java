class Solution {
    public int solution(int[] a, int[] b) {
        Long answer = 0L;
        for(int i =0; i<a.length;i++){
            answer+=new Long(a[i]*b[i]);
        }
        return answer.intValue();
    }
}