import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        ArrayList<Integer> answer = new ArrayList<>();
        
        for (int i: arr) {
            for (int j = 0; j < i; j++) {
                answer.add(i);
            }
        }
        
        int[] array = answer.stream().mapToInt(i -> i).toArray();
        
        return array;
    }
}