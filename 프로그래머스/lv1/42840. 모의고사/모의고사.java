import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(2, 1, 2, 3, 2, 4, 2, 5));
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(3, 3, 1, 1, 2, 2, 4, 4, 5, 5));

        SortedMap<Integer, Integer> map = new TreeMap<>();
        map.put(1, count(list1, answers));
        map.put(2, count(list2, answers));
        map.put(3, count(list3, answers));

        int maxPoints = Collections.max(map.values());
        List<Integer> answerList = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
            if (map.get(i) == maxPoints) {
                answerList.add(i);
            }
        }

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }

    private int count(ArrayList<Integer> list, int[] arr) {
        int point = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == list.get(i % list.size())) {
                point++;
            }
        }
        return point;
    }
}