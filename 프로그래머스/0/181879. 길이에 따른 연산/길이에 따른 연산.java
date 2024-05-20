import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        
        int sum = 0;
        int mul = 1;
        
        if (num_list.length > 10) {
            sum = Arrays.stream(num_list).sum();
            return sum;
        } else {
            for (int i: num_list) {
                mul *= i;
            }
            return mul;
        }
    }
}