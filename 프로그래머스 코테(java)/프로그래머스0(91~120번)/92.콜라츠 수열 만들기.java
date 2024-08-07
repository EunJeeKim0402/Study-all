// 레벨 0
// https://school.programmers.co.kr/learn/courses/30/lessons/181919

import java.util.*;

class Solution {
    public List<Integer> solution(int n) {
        List<Integer> answer = new ArrayList<>();
        while(n>1) {
            answer.add(n);
            if(n%2==0) {
                n=n/2;
            } else {
                n=3*n+1;
            }
        }
        answer.add(1);
        return answer;
    }
}