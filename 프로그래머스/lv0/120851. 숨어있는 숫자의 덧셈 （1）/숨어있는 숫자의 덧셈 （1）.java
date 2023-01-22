class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int a = 0;
        my_string=my_string.replaceAll("[^0-9]", "");
        String[] strArray = my_string.split("");
        for(String s : strArray) {
            a = Integer.parseInt(s);
            answer+=a;
            
        }
        return answer;
    }
}