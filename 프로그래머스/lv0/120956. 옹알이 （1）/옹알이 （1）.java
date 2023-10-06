class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] arr = {"aya", "ye", "woo", "ma"};
        
        for(String str : babbling){
            for(int i=0;i<arr.length;i++){
                if(str.startsWith(arr[i])){
                    str = str.substring(arr[i].length());
                    i = -1;
                }
            }
            if(str.isEmpty()){
                answer++;
            }
        }
        
        return answer;
    }
}