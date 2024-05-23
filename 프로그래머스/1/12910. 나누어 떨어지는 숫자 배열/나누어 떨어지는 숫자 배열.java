import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        
        for (int i: arr) {
            if (i % divisor == 0){
                list.add(i);
            } 
        }
        
        if (list.size() == 0) list.add(-1);
        
        int[] answer = list.stream().mapToInt(i->i).toArray();
        
        return answer;
    }
}
        