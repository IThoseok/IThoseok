import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        if(arr.length ==1 || arr.length==0){
          int[] answer={-1};
            return answer;
        }
        int[] arr2=arr.clone();
        Arrays.sort(arr2);
        int[] answer=new int[arr.length-1];
        int i =0;
        for(int a : arr){
            if(a!=arr2[0]){
               answer[i]=a; 
                i++;
            }
            
        }
        
        return answer;
    }
}