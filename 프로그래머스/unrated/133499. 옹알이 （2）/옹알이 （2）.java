class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        String[] arr = { "aya", "ye", "woo", "ma" };

        for (int j = 0; j < babbling.length; j++) {
            boolean rewind = false; 

            String str = babbling[j]; 

            if (str.equals("") || str.contains("ayaaya") || str.contains("yeye") || str.contains("woowoo") || str.contains("mama")) {
                continue;
            } else {
                for (int i = 0; i < arr.length; i++) {
                    if (str.startsWith(arr[i])) {
                        babbling[j] = str.substring(arr[i].length());
                        rewind = true;
                    }
                }
            }
            if (rewind) {
                j = -1;
            }
        }
        
        for(String str : babbling){
            if(str.equals("")){
                answer++;
            }
            System.out.println(str);
        }


        return answer;
    }
}