import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 1;
        priorities[location] *= 10;
        //List<Integer> list = Arrays.stream(priorities).boxed().collect(Collectors.toList());
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i : priorities) {
            queue.add(i);
        }
        
        
        while (!queue.isEmpty()) {
            int current = queue.poll();
            
            if (isBiggest(current, queue)) {
                if (current == priorities[location]) {
                    return answer;
                }
                answer++;
                
            } else {
                //int temp = list.get(0);
               // list.remove(0);
                //list.add(temp);
                queue.add(current); // 현재 원소를 큐의 맨 뒤로 이동
            }
        }

        return answer;
    }

    private boolean isBiggest(int num, Queue<Integer> queue) {
        for (int a : queue) {
            if(num > 9){//num이 로케이션숫자임
                if(num/10 < a){
                    return false;
                }
            }else if(a > 9){//a가 로케이션숫자임
                if(num < a/10){
                    return false;
                }
            }else if(num < a){
                return false;
            }
        }
        return true;
    }
}