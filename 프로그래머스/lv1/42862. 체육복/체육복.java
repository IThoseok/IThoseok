import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        
        Set<Integer> set = new TreeSet<>();
        Set<Integer> set3 = new TreeSet<>();
        for (int num : reserve) {
            set.add(num);
            set3.add(num);
        }
        Set<Integer> set2 = new TreeSet<>();
        for (int num : lost) {
            set2.add(num);
        }
        set.removeAll(set2);
        set2.removeAll(set3);
        
        
        
        for (int num : set2) {
            System.out.println(num);
            if (set.contains(num)) {
                set.remove(num);
            } else if (set.contains(num - 1)) {
                set.remove(num - 1);
            } else if (set.contains(num + 1)) {
                set.remove(num + 1);
            } else {
                answer--;
            }
        }
        
        return answer;
    }
}