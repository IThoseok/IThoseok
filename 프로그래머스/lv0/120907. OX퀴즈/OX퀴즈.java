class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i=0;i<quiz.length;i++){
            String[] parts = quiz[i].split(" ");
            int operand1 = Integer.parseInt(parts[0]);
            int operand2 = Integer.parseInt(parts[2]);
            int result = Integer.parseInt(parts[4]);
            if(parts[1].equals("-")){
                operand2 *=-1;
            }
            
            if (operand1 + operand2 == result) {
                answer[i] = "O";
            } else {
                answer[i] = "X";
            }
            
        }
        return answer;
    }
}