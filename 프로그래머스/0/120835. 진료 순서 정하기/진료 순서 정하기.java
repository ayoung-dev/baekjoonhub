import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] arr = emergency.clone();
        Arrays.sort(arr);
        
        int[] answer = new int[emergency.length];
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < emergency.length; j++) {
                if (arr[i] == emergency[j]) {
                    answer[j] = emergency.length - i;
                    break;
                }
            }
        }
        
        return answer;
    }
}