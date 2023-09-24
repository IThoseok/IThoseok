import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        //int[] answer = {};
        HashMap<String, Integer> map = new HashMap<>();
        for(String term : terms){
            map.put(term.substring(0, term.indexOf(' ')), Integer.parseInt(term.substring(term.indexOf(' ') + 1)));
        }
        
        int todayYear = Integer.parseInt(today.substring(0, today.indexOf('.')));
        int todayMonth = Integer.parseInt(today.substring(today.indexOf('.') + 1, today.lastIndexOf('.')));
        int todayDay = Integer.parseInt(today.substring(today.lastIndexOf('.') + 1));
        
        
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<privacies.length;i++){
            String date = privacies[i].substring(0, privacies[i].indexOf(' ')); 
            String term = privacies[i].substring(privacies[i].indexOf(' ') + 1);
            
            int year = Integer.parseInt(date.substring(0, date.indexOf('.')));
            int month = Integer.parseInt(date.substring(date.indexOf('.') + 1, date.lastIndexOf('.')));
            int day = Integer.parseInt(date.substring(date.lastIndexOf('.') + 1))-1;
            
            month += map.get(term);
            if(month>12){
                year += month / 12;
                month = month % 12;
            }
            if(day==0){
                day=28;
                month--;
            }
            if(month==0){
                month = 12;
                year--;
            }
            if(year<todayYear){
                list.add(i+1);
            }else if(month<todayMonth && year==todayYear){
                list.add(i+1);
            }else if(month==todayMonth && year==todayYear&&day<todayDay){
                list.add(i+1);
            }
            System.out.println(year+","+month+","+day);
            //String year = date.substring(0, date.indexOf('.')); 
            //String month = date.substring(date.indexOf('.') + 1, date.lastIndexOf('.')); 
            //String day = date.substring(date.lastIndexOf('.') + 1); 
        }

        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}