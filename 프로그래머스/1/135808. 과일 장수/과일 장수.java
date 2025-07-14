import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        Integer[] arr = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());
        
        int answer = 0;
        
        for (int i = m; i <= score.length; i = i + m) {
            answer += arr[i - 1] * m;
        }
        
        return answer;
    }
}