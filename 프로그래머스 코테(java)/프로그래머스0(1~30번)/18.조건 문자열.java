// 레벨 0
// https://school.programmers.co.kr/learn/courses/30/lessons/181934?language=java

class Solution {
        public int solution(String ineq, String eq, int n, int m) {
                if (ineq.equals(">")) {
                        if (eq.equals("=")) {
                                return n >= m ? 1 : 0;
                        } else if (eq.equals("!")) {
                                return n > m ? 1 : 0;
                        }
                } else if (ineq.equals("<")) {
                        if (eq.equals("=")) {
                                return n <= m ? 1 : 0;
                        } else if (eq.equals("!")) {
                                return n < m ? 1 : 0;
                        }
                }

                return 0;
        }
}