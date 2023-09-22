import java.util.regex.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        
        String[] parts = dartResult.split("(?=\\d)");
        for(int i=0;i<parts.length;i++){
            if(parts[i].equals("1")){
                parts[i+1] = parts[i] + parts[i+1];
                parts[i] = "";
            }
        }
        int minus = -1;
        boolean oops = false;
        boolean star = false;
        
        for(int i=parts.length-1;i>=0;i--){
            if(parts[i].isEmpty()){
                continue;
            }
            
            
            Pattern pattern = Pattern.compile("\\d+");
            Matcher matcher = pattern.matcher(parts[i]);
            
            
            
            int point = 0;
            
            if (matcher.find()) {
                String numberStr = matcher.group(); 
                point = Integer.parseInt(numberStr); 
            }
            
            Pattern pattern4 = Pattern.compile("[DT]");
            Matcher matcher4 = pattern4.matcher(parts[i]);
            
            if (matcher4.find()) {
                if(parts[i].contains("D")){
                    point = (int)Math.pow(point, 2);
                }else{
                    point = (int)Math.pow(point, 3);
                    
                }
                
                
            }
            
            Pattern pattern2 = Pattern.compile("[*]");
            Matcher matcher2 = pattern2.matcher(parts[i]);
            
            
            Pattern pattern3 = Pattern.compile("[#]");
            Matcher matcher3 = pattern3.matcher(parts[i]);
            
            if(star){
                point *= 2;
                star = false;
                System.out.println(point);
            }
            
            if (matcher2.find()){
                point *= 2;
                star = true;
            }
            if (matcher3.find()){
                point *= -1;
            }
            
            answer += point;
            
        }
        
        return answer;
    }
}