import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int left = 10;
        int right = 12;
        int leftdiff = 0;
        int rightdiff = 0;

        hand = hand.toUpperCase();

        for (int number : numbers) {
            if (number == 1 || number == 4 || number == 7) {
                answer = answer + "L";
                left = number;
            } else if (number == 3 || number == 6 || number == 9) {
                answer = answer + "R";
                right = number;
            } else if (number == 0) {
                    rightdiff = findDiff(right, 11);
                    leftdiff = findDiff(left, 11);
                    if (rightdiff == leftdiff) {
                        if (hand.equals("RIGHT")) {
                            answer = answer + "R";
                            right = number;
                        } else {
                            answer = answer + "L";
                            left = number;
                        }
                    }else if(rightdiff>leftdiff){
                        answer = answer + "L";
                        left = number;
                    }else if(rightdiff<leftdiff){
                        answer = answer + "R";
                        right = number;
                    }
                } else if (right == 0) {
                    rightdiff = findDiff(11, number);
                    leftdiff = findDiff(left, number);
                    if (rightdiff == leftdiff) {
                        if (hand.equals("RIGHT")) {
                            answer = answer + "R";
                            right = number;
                        } else {
                            answer = answer + "L";
                            left = number;
                        }
                    }else if(rightdiff>leftdiff){
                        answer = answer + "L";
                        left = number;
                    }else if(rightdiff<leftdiff){
                        answer = answer + "R";
                        right = number;
                    }
                } else if (left == 0) {
                    rightdiff = findDiff(right, number);
                    leftdiff = findDiff(11, number);
                    if (rightdiff == leftdiff) {
                        if (hand.equals("RIGHT")) {
                            answer = answer + "R";
                            right = number;
                        } else {
                            answer = answer + "L";
                            left = number;
                        }
                    }else if(rightdiff>leftdiff){
                        answer = answer + "L";
                        left = number;
                    }else if(rightdiff<leftdiff){
                        answer = answer + "R";
                        right = number;
                    }
                } else {
                    rightdiff = findDiff(right, number);
                    leftdiff = findDiff(left, number);
                    if (rightdiff == leftdiff) {
                        if (hand.equals("RIGHT")) {
                            answer = answer + "R";
                            right = number;
                        } else {
                            answer = answer + "L";
                            left = number;
                        }
                    }else if(rightdiff>leftdiff){
                        answer = answer + "L";
                        left = number;
                    }else if(rightdiff<leftdiff){
                        answer = answer + "R";
                        right = number;
                    }
                }
        }

        return answer;
    }

    private int findDiff(int finger, int number) {
        if (Math.abs(finger - number) == 2 || Math.abs(finger - number) == 4 || Math.abs(finger - number) == 6) {
            return 2;
        }
        if (Math.abs(finger - number) == 3||Math.abs(finger - number) == 1) {
            return 1;
        }
        if (Math.abs(finger - number) == 5 || Math.abs(finger - number) == 7 || Math.abs(finger - number) == 9) {
            return 3;
        }
        if (Math.abs(finger - number) == 8 || Math.abs(finger - number) == 10) {
            return 4;
        }
        return 0; // 모든 경우에 해당하지 않을 때 0을 반환
    }
}