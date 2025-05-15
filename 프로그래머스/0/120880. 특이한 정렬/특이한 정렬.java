import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        Integer[] answer = Arrays.stream(numlist).boxed().toArray(Integer[]::new);

        Arrays.sort(answer, (a, b) -> {
            int distA = Math.abs(a - n);
            int distB = Math.abs(b - n);
            if (distA == distB) {
                return b - a;
            } else {
                return distA - distB;
            }
        });

        return Arrays.stream(answer).mapToInt(i -> i).toArray();
    }
}
