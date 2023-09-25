import java.util.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i=0;i<arr1.length;i++){
            String binary = Integer.toBinaryString(arr1[i] | arr2[i]);
            binary = String.format("%0"+n+"d", Long.parseLong(binary));
            answer[i] = binary.replaceAll("1", "#").replaceAll("0", " ");
        }
        
        return answer;
    }
}