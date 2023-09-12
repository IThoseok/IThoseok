import java.util.Arrays;

class Solution {
    public int[] solution(int n, long left, long right) {
    if (n == 0 || left < 0 || right < 0) {
        return new int[0];
    }

    int[] answer = new int[(int) (right - left + 1)];

    for (int i = 0; i < (int) (right - left + 1); i++) {
        int row = (int) ((left + i) / n);
        int col = (int) ((left + i) % n);

        if (row <= col) {
            answer[i] = col + 1;
        } else {
            answer[i] = row + 1;
        }
    }

    return answer;
        
    }
}