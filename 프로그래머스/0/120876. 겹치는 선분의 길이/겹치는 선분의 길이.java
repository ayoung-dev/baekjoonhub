import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        Map<Integer, Integer> map = new HashMap<>();
        long answer = 0;
        
        for (int[] line: lines) {
            for (int i = line[0]; i < line[1]; i++) {
                map.compute(i, (a, b) -> (b == null) ? 1 : b + 1);
            }
        }
        
        answer = map.values().stream()
            .filter(num -> num >= 2)
            .count();
        
        return (int) answer;
    }
}