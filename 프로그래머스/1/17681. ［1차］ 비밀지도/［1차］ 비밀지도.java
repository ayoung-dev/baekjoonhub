import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for (int i = 0; i < n; i++) {
            String binary = Integer.toBinaryString(arr1[i] | arr2[i]);
            String formatted = String.format("%" + n + "s", binary);
            answer[i] = formatted.replace("0", " ").replace("1", "#");
        }
        
        return answer;
    }
}