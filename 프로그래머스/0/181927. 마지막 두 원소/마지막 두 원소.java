import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int length = num_list.length;
        int[] answer = new int[length + 1];
        
        int num1 = num_list[length - 1];
        int num2 = num_list[length - 2];
        
        for (int i = 0; i < length; i++){
            answer[i] = num_list[i];
        }
        
        if (num1 > num2) 
            answer[length] = num1 - num2;
        else
            answer[length] = num1 * 2;
        
        return answer;
    }
}