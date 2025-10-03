import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> basket = new Stack<>();
        basket.push(0);
        int result = 0;
        
        for (int i = 0; i < moves.length; i++) {
            int num = moves[i] - 1;
            for (int j = 0; j < board.length; j++) {
                int doll = board[j][num];
                if (doll > 0) {
                    if (basket.peek() == doll) {
                        result += 2;
                        basket.pop();
                    } else {
                        basket.push(doll);
                    }
                    board[j][num] = 0;
                    break;
                }
            }
        }
        
        return result;
    }
}