import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        String a = String.valueOf(n);;
        String[] b = a.split("");
        Arrays.sort(b,  Collections.reverseOrder());
        a = String.join("", b);
        
        return Long.parseLong(a);  
    }
}