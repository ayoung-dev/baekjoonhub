class Solution {
    int[][] pos = {
        {3, 1}, {0, 0}, {0, 1}, {0, 2},
        {1, 0}, {1, 1}, {1, 2},
        {2, 0}, {2, 1}, {2, 2}
    };
    
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        int left = 10;
        int right = 12;
        
        for (int i : numbers) {
            if (i == 1 || i == 4 || i == 7) {
                sb.append("L");
                left = i;
            } else if (i == 3 || i == 6 || i == 9) {
                sb.append("R");
                right = i;
            } else {
                int lDist = getDist(left, i);
                int rDist = getDist(right, i);
                
                if (lDist == rDist) {
                    if (hand.equals("right")) {
                        sb.append("R");
                        right = i;
                    } else {
                        sb.append("L");
                        left = i;
                    }
                } else if (lDist < rDist) {
                    sb.append("L");
                    left = i;
                } else {
                    sb.append("R");
                    right = i;
                }
            }
        }
        return sb.toString();
    }
    
    private int getDist(int from, int to) {
        if (from == 0) from = 11; 
        if (to == 0) to = 11;
        return Math.abs((from - 1) / 3 - (to - 1) / 3)
             + Math.abs((from - 1) % 3 - (to - 1) % 3);
    }
}