import java.util.Arrays;

class Solution {
    public int solution(String[] strArr) {
        int[] arr = new int[31];
        int answer = 0;
        
        for (String s: strArr) {
            arr[s.length()]++; 
        }
        
        for (int i: arr) {
            answer = answer < i ? i : answer;
        }
        
        return answer;
    }
}