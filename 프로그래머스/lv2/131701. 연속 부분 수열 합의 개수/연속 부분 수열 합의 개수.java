import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        List<Integer> list = new ArrayList<>(Arrays.asList(toIntegerArray(elements)));
        List<Integer> tmp = new ArrayList<>();
        int sum = 0;
        
        for(int i=0;i<elements.length;i++){
            if(i>0){
                list.add(elements[i-1]);
            }
            
            for(int j=0;j<elements.length;j++){
                for(int k=j;k<j+i;k++){
                    sum += list.get(k);
                }

                tmp.add(sum); 
 
                sum = 0;
            }
            
            
        }
        Set<Integer> set = new HashSet<Integer>(tmp);
        List<Integer> newList =new ArrayList<Integer>(set);
        answer = newList.size();
        
        
        return answer;
    }
    
    private Integer[] toIntegerArray(int[] array) {
        Integer[] result = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }
}