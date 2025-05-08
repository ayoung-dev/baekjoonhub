class Solution {
    public int solution(int[][] dots) {
        int maxX = Integer.MIN_VALUE, maxY = Integer.MIN_VALUE;
        int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE;
        
        for (int[] dot: dots) {
            maxX = Math.max(maxX, dot[0]);
            maxY = Math.max(maxY, dot[1]);
            minX = Math.min(minX, dot[0]);
            minY = Math.min(minY, dot[1]);
        }
        
        return (maxX - minX) * (maxY - minY);
    }
}
