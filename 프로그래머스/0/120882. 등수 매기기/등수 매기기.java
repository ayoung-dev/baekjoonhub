import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int len = score.length;
        double[][] avg = new double[len][2];
        int[] answer = new int[len];

        for (int i = 0; i < len; i++) {
            avg[i][0] = (score[i][0] + score[i][1]) / 2.0;
            avg[i][1] = i;
        }

        Arrays.sort(avg, (a, b) -> Double.compare(b[0], a[0]));
        
        for (int i = 0; i < len; i++) {
            if (i > 0 && avg[i][0] == avg[i - 1][0]) {
                answer[(int) avg[i][1]] = answer[(int) avg[i - 1][1]];
            } else {
                answer[(int) avg[i][1]] = i + 1;
            }
        }

        return answer;
    }
}
