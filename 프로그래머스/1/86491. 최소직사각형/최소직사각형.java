import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int len = sizes.length;
        int[] w = new int[len];
        int[] h = new int[len];
        
        for (int i = 0; i < len; i++) {
            w[i] = sizes[i][0];
            h[i] = sizes[i][1];
            
            if (h[i] > w[i]) {
                int temp = w[i];
                w[i] = h[i];
                h[i] = temp;
            }
        }
        
        Arrays.sort(w);
        Arrays.sort(h);
        
        return w[len - 1] * h[len - 1];
    }
}