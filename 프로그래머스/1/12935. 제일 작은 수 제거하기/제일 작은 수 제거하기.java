import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        List<Integer> list = new ArrayList<>();
        
        int min = Arrays.stream(arr).min().getAsInt();
        
        for (int i: arr) {
            if (i != min) list.add(i);
        }
        
        if (list.size() == 0) {
            int[] answer = {-1};
            return answer;
        }
        
        int[] answer = list.stream().mapToInt(i->i).toArray();
        
        return answer;
        
    }
}