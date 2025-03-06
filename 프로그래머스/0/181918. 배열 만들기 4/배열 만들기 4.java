import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList();
        int i = 0;
        
        while(i < arr.length) {
            int size = stk.size();
            
            if (size > 0 && stk.get(size - 1) >= arr[i]) {
                stk.remove(size -1);
            } else {
                stk.add(arr[i]);
                i++;
            }
        }
        
        return stk.stream().mapToInt(x -> x).toArray();
    }
}