class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int x = board[0] / 2;
        int y = board[1] / 2;
        
        for (int i = 0; i < keyinput.length; i++) {
            switch (keyinput[i]) {
                case "up": 
                    if (answer[1] == y) break;
                    answer[1]++;
                    break;
                case "down":
                    if (answer[1] == -y) break;
                    answer[1]--;
                    break;
                case "left":
                    if (answer[0] == -x) break;
                    answer[0]--;
                    break;
                default:
                    if (answer[0] == x) break;
                    answer[0]++;
                    break;
            }
        }
        return answer;
    }
}