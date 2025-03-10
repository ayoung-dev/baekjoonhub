import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList();

        for (int i: arr) {
            if (list.size() == k) break;
            if (!list.contains(i)) list.add(i);
        }
        
        if (list.size() < k) {
            for (int j = list.size(); j < k; j++) {
                list.add(-1);
            }
        }
        
        return list.stream().mapToInt(x -> x).toArray();
    }
}