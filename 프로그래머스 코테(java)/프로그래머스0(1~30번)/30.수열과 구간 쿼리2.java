// 레벨 0
// https://school.programmers.co.kr/learn/courses/30/lessons/181923

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = -1;
        }

        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];

            for (int j = s; j <= e; j++) {
                if (arr[j] > k) {
                    if (answer[i] == -1) {
                        answer[i] = arr[j];
                    } else if (answer[i] > arr[j]) {
                        answer[i] = arr[j];
                    }
                }
            }
        }
        return answer;
    }
}