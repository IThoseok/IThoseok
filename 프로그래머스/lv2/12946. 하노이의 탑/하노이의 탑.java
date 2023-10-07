import java.util.*;

class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[(int)Math.pow(2, n)-1][2];
        
        if(n==1){
            return new int[][] {{1, 3}};
        }
        List<List<Map<Integer, Integer>>> listOfLists = new ArrayList<>();
        
        for(int i=0;i<2;i++){
            List<Map<Integer, Integer>> listOfMaps = new ArrayList<>();
            for(int j=0;j<(int)Math.pow(2,i);j++){
                Map<Integer, Integer> map = new LinkedHashMap<>();
                listOfMaps.add(map);
            }
            listOfLists.add(listOfMaps);
        }
        
        int[] arr1 = {1, 2};
        int[][] arr2 = {{1, 3},{2, 3}};

        listOfLists.get(0).get(0).put(arr1[0], arr1[1]);
        listOfLists.get(1).get(0).put(arr2[0][0], arr2[0][1]);
        listOfLists.get(1).get(1).put(arr2[1][0], arr2[1][1]);
        
        for(int i=1;i<n-1;i++){
            List<Map<Integer, Integer>> listOfMaps = listOfLists.get(i-1);//13
            List<Map<Integer, Integer>> listOfMaps2 = listOfLists.get(i);//12 32
            List<Map<Integer, Integer>> combinedList = new ArrayList<>();
            combinedList.addAll(listOfMaps);

            for (Map<Integer, Integer> map : listOfMaps2) {
                Map<Integer, Integer> reversedMap = new LinkedHashMap<>();
                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    if(combinedList.size()==listOfMaps.size() || combinedList.size()==listOfMaps.size()*2){
                        reversedMap.put(entry.getValue(), entry.getKey());
                        
                    }else{
                        reversedMap.put(entry.getKey(), entry.getValue());
                    }
                }
                combinedList.add(reversedMap);
            }
            
            combinedList.addAll(listOfMaps);
            listOfLists.add(combinedList);
  
        }
        
        int idx = 0;
        for (List<Map<Integer, Integer>> subList : listOfLists) {
            for (Map<Integer, Integer> map : subList){
                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    answer[idx][0] = entry.getKey();
                    answer[idx][1] = entry.getValue();
                    if(n%2 == 1){
                        if(entry.getKey()==2){
                            answer[idx][0] = 3;
                        }else if(entry.getKey()==3){
                            answer[idx][0] = 2;
                        }
                        if(entry.getValue()==2){
                            answer[idx][1] = 3;
                        }else if(entry.getValue()==3){
                            answer[idx][1] = 2;
                        }
                    }
                    idx++;
                }
            }   
        }
        
        return answer;
    }
}