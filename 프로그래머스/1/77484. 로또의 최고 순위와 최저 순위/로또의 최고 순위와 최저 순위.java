import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        List<Integer> lottosList = Arrays.stream(lottos)
        .boxed()
        .collect(Collectors.toList());
        
        int zeroCount = Collections.frequency(lottosList, 0);
        int winCount = 0;
        
        for (int num : win_nums) {
            if (lottosList.contains(num)) winCount++;
        }
        
        answer[1] = winCount < 2 ? 6 : 7 - winCount;
        answer[0] = winCount + zeroCount < 2 ? 6 : 7 - winCount - zeroCount;
        
        return answer;
    }
}