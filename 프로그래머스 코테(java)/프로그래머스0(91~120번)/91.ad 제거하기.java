// 레벨 0
// https://school.programmers.co.kr/learn/courses/30/lessons/181870

import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> arrayList = new ArrayList<>();

        for (String str : strArr)
            if (!str.contains("ad"))
                arrayList.add(str);

        int idx = 0;
        String[] answer = new String[arrayList.size()];
        for (String str : arrayList)
            answer[idx++] = str;
        return answer;
    }
}