import java.util.*;
import java.util.stream.Collectors;


class Solution {
    private int[][] dungeons;
    
    public int solution(int k, int[][] dungeons) {
        this.dungeons = dungeons;
        
        int answer = 0;
        ArrayList<ArrayList<Integer>> listOfLists = new ArrayList<>();
        
        
        for (int i = 0; i < dungeons.length; i++) {
            ArrayList<Integer> initialList = new ArrayList<>();
            initialList.add(i);
            listOfLists.add(initialList);
        }
        
        
        listOfLists = find(listOfLists);
        
        for(ArrayList<Integer> list2 : listOfLists){
            int count = 0;
            int tmp = k;
            for(int index : list2){
                if(dungeons[index][0] <= tmp && dungeons[index][1] <= tmp){
                    count++;
                    tmp -= dungeons[index][1];
                }
            }
            if(answer < count){
                answer = count;
            }
        }        
        return answer;
    }
    
    public ArrayList<ArrayList<Integer>> find(ArrayList<ArrayList<Integer>> lists) {
        
        if(lists.get(0).size() == dungeons.length){
            return lists;
        }
        
        ArrayList<ArrayList<Integer>> newLists = new ArrayList<>();
        
        for(ArrayList<Integer> list : lists){
            for(int i = 0; i < dungeons.length; i++){
                if(!list.contains(i)){
                    ArrayList<Integer> newList = new ArrayList<>(list);
                    newList.add(i);
                    newLists.add(newList);
                }
            }
        }

        return find(newLists);
    }
}