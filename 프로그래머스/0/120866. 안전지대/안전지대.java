class Solution {
    int length, answer;
    int[][] temp;
    
    public int solution(int[][] board) {
        length = board.length;
        temp = new int[length + 2][length + 2];
        answer = 0;
        
        for (int i = 0; i < length; i++) {
            System.arraycopy(board[i], 0, temp[i + 1], 1, length);
        }
        
        for (int i = 1; i < length + 1; i++) {
            for (int j = 1; j < length + 1; j++) {
                findDangerArea(i, j);
            }
        }
        
        countDangerArea(temp);
        
        return answer;
    }
    
    void findDangerArea(int i, int j) {
        if (temp[i][j] == 1) {
            for (int k = i - 1; k <= i + 1; k++) {
                for (int l = j - 1; l <= j + 1; l++)
                    if (temp[k][l] != 1) {
                        temp[k][l] = 2;
                    }
            }
        }
    }
    
    void countDangerArea(int[][] temp) {
        for (int i = 1; i < length + 1; i++) {
            for (int j = 1; j < length + 1; j++) {
                if(temp[i][j] == 0) answer++;
            }
        }
    }
}