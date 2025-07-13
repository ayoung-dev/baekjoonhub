import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] nums) {
        int count = nums.length / 2;

        Set<Integer> set = Arrays.stream(nums)
                                .boxed()
                                .collect(Collectors.toSet());
        
        return Math.min(set.size(), count);
    }
}