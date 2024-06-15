import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 100;
        
        for (int i = 0; i < array.length; i++) {
            if (Math.abs(answer - n) > Math.abs(array[i] - n)) 
                answer = array[i];
            else if (Math.abs(answer - n) == Math.abs(array[i] - n))
                answer = answer > array[i] ? array[i] : answer;
        }
        
        return answer;
    }
}