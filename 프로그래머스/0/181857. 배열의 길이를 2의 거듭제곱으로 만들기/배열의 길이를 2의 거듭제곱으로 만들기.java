import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int pow = (int) Math.ceil(Math.log(arr.length) / Math.log(2));
        int size = (int) Math.pow(2, pow);
        
        if (size == arr.length) {
            return arr;
        }
        
        int[] answer = Arrays.copyOf(arr, size);
        return answer;
    }
}