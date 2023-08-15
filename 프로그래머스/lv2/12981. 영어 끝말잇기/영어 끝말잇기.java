class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};

        for (int i = 1; i < words.length; i++) {
            if (words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0)) {
                answer[0] = (i % n) + 1;  // 번호
                answer[1] = (int) Math.ceil((double) (i + 1) / n);  // 차례
                return answer;
            }

            for (int j = i - 1; j >= 0; j--) {
                if (words[i].equals(words[j])) {
                    answer[0] = (i % n) + 1;  // 번호
                    answer[1] = (int) Math.ceil((double) (i + 1) / n);  // 차례
                    return answer;
                }
            }
        }

        return answer;
    }
}
