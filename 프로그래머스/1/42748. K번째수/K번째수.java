import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> answer = new ArrayList<>();
        
        for (int i = 0; i < commands.length; i++) {
            int[] command = commands[i];
            int[] cut = Arrays.copyOfRange(array, command[0] - 1, command[1]);
            Arrays.sort(cut);
            answer.add(cut[command[2] - 1]);
        }
        
        return answer.stream().mapToInt(x -> x).toArray();
    }
}