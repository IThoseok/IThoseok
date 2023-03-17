class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String[] a = phone_number.split("");
        int b = a.length;
        for(int i = 0;i<b;i++){
            if(i>=b-4){
            answer+=a[i];    
            }else{
              answer+="*";  
            }
            
        }
        return answer;
    }
}