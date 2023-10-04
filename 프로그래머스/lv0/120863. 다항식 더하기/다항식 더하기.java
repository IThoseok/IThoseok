class Solution {
    public String solution(String polynomial) {
        String answer = "";
        polynomial = polynomial.replaceAll("\\s+", "");
        String[] arr = polynomial.split("\\+");
        int sum = 0;
        int countX = 0;
        
        for(String str : arr){
            try {
                sum += Integer.parseInt(str);
            } catch (NumberFormatException e) {
                if(str.length()==1){
                    countX++;
                }else{
                    countX += Integer.parseInt(str.substring(0, str.length()-1));
                }
            }   
        }
        
        String strSum = "";
        String strX = "";
        
        if(countX==1){
            answer = "x";
        }else if(countX>1){
            answer = countX + "x";
        }
        
        if(sum!=0 && !answer.isEmpty()){
            answer = answer +" + "+sum;
        }else if(sum!=0){
            answer = answer+sum;
        }
        
        return answer ;
    }
}