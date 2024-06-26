// 레벨 0
// https://school.programmers.co.kr/learn/courses/30/lessons/181899

/*
정수 start와 end가 주어질 때, start에서 end까지 1씩 감소하는 수들을 
차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
*/

class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[start - end + 1];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = start;
            start--;
        }

        return answer;
    }
}