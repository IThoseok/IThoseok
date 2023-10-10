import java.util.StringTokenizer;
class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        StringBuilder sb = new StringBuilder();
        
        while (n > 0) {
            sb.append(n % k);
            n /= k;
        }
        
        String str = sb.reverse().toString();
        StringTokenizer tokenizer = new StringTokenizer(str, "0");
        //System.out.println(str);
        String[] numbers = str.split("0");
        //System.out.println(numbers[numbers.length-1]);
        for (String number : numbers){
            //String number = tokenizer.nextToken();
            //System.out.println(number);
            if(!number.isEmpty() && !number.matches(".*[a-zA-Z].*")){
                Long num = Long.parseLong(number);
                
                if(isPrime(num)){
                    answer++;
                }
                
            }
            
        }
        return answer;
    }
    public static boolean isPrime(long num){
        if(num == 1){
            return false;
        }
        
        if(num == 2) return true;
        
        for(int i=2;i<=(int)Math.sqrt(num);i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}