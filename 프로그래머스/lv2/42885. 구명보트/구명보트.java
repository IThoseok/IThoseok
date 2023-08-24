import java.util.Arrays;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int num = people.length-1;
        int i = 0;
            
            while(num>i){

                if(people[num]+people[i]>limit){ //뒤만 태우기
                    answer++;
                    num--;
                }else{ //둘다 태우기
                    answer++;
                    num--;
                    i++;
                }
                if(num==i){
                    answer++;
                }
                
            }
            
        
        return answer;
    }
}