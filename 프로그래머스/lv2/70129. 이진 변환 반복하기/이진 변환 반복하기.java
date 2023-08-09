class Solution {
    public int[] solution(String s) {
        int answer[] = {1,0};
        
        while(true){
            int length = s.length();
            s = s.replace("0","");
            answer[1] += length-s.length(); //제거할 0개수
            length = s.length(); // 제거 후 길이
            if(length==1){ //제거 후 길이 1이면 종료
                break;
            }
            
            s = "";
            while(length>0){ //이진변환
                s = String.valueOf(length%2)+s;
                length/=2;
            }
            answer[0] += 1; //이진 변환 횟수

            
        }
        
        
        
        return answer;
    }
}