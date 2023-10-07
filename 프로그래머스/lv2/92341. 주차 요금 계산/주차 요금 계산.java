import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
class Solution {
    public int[] solution(int[] fees, String[] records) throws ParseException{
        
        TreeMap<String, List<String>> map = new TreeMap<>();
        
        for(String record : records){
            
            map.computeIfAbsent(record.substring(6,10), k -> new ArrayList<>()).add(record.substring(0,5));
        }
        
        int[] answer = new int[map.size()];
        
        int indexOfArr = 0;
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<String> times = entry.getValue();
            if(times.size()%2==1){//최종 출차기록 없는경우
                times.add("23:59");
            }
            
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
            long differenceInMillis = 0;

            for (int i=0;i<times.size();i++) {
                Date date = sdf.parse(times.get(i));
                if(i % 2 == 0){
                    differenceInMillis -= date.getTime();
                }else{
                    differenceInMillis += date.getTime();
                }
            }
            long differenceInMinutes = differenceInMillis / (60 * 1000);
            System.out.println(differenceInMinutes);
            
            answer[indexOfArr] += fees[1]; //기본요금
            if(differenceInMinutes>fees[0]){//기본시간 초과
                long additionalFee = (differenceInMinutes-(long)fees[0])/(long)fees[2];
                if((differenceInMinutes-fees[0])%fees[2]!=0){
                    additionalFee++;//올림
                }
                answer[indexOfArr] += additionalFee*fees[3];
            }
            
            indexOfArr++;
        }
        
        
        return answer;
    }
}