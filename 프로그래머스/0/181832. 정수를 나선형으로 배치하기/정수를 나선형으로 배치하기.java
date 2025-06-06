class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int num = 1;
        int startX = 0, startY = 0;
        int endX = n - 1, endY = n - 1;
        
        while (num <= n * n) {
            for (int i = startX; i <= endX; i++) {
                answer[startY][i] = num++;
            }
            startY++;
            
            for (int i = startY; i <= endY; i++) {
                answer[i][endX] = num++;
            }
            endX--;
            
            for (int i = endX; i >= startX; i--) {
                answer[endY][i] = num++;
            }
            endY--;
            
            for (int i = endY; i >= startY; i--) {
                answer[i][startX] = num++;
            }
            startX++;
        }
        
        return answer;
    }
}