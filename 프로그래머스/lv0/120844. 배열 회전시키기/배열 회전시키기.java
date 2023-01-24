class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        if(direction.equals("left")){
            answer[numbers.length-1] = numbers[0];
            for(int a=1;a<numbers.length;a++){
                answer[a-1] = numbers[a];
            }
        }else{
            answer[0] = numbers[numbers.length-1];
            for(int a=0;a<numbers.length-1;a++){
                answer[a+1] = numbers[a];
            }
        }
        return answer;
    }
}