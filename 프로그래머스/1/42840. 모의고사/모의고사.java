import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] counts = new int[3];
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < answers.length; i++) {
            int answer = answers[i];
            if (answer == a[i % a.length]) counts[0]++;
            if (answer == b[i % b.length]) counts[1]++;
            if (answer == c[i % c.length]) counts[2]++;
        }
        
        int max = Math.max(counts[0], Math.max(counts[1], counts[2]));

        for (int i = 0; i < 3; i++) {
            if (counts[i] == max) {
                result.add(i + 1);
            }
        }
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}