import java.util.*;
class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 100;
        List<List<String>> visited = new ArrayList<>();
        List<String> list = new ArrayList<>();
        list.add(begin);
        while(!list.isEmpty()){
            int size = list.size();
            for(String word : words){
                if(isSame(list.get(list.size()-1), word)&&!list.contains(word)){
                    list.add(word);
                    //System.out.println(list+"만듬");
                    if(visited.contains(list)){
                        //System.out.println(list+"중복적발");
                        list.remove(list.size()-1);
                        continue;
                    }
                    //System.out.println(list+"적발피함");
                    
                }
                if(list.get(list.size()-1).equals(target)){
                        //visited.add(list);
                        //System.out.println(list);
                        answer = Math.min(answer, list.size()-1);
                        //list.remove(list.size()-1);
                        continue;
                }
                
            }
            if(size == list.size()){
                visited.add(new ArrayList<>(list));
                //System.out.println(list+"중복처리");
                list.remove(list.size()-1);
            }
        }
        if(answer==100){
            return 0;
        }
        
        return answer;
    }
    private static boolean isSame(String target, String word){
        int cnt = 0;
        for (int i = 0; i < target.length(); i++) {
            if (target.charAt(i) != word.charAt(i)) {
                cnt++;
            }
        }
        return cnt == 1;
    }
     

}