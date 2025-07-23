import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        Map<Integer, Double> map = new HashMap<>();
        int players = stages.length;
        
        for (int i = 1; i <= N; i++) {
            int count = 0;
            
            for (int stage : stages) {
                if (stage == i) count++;
            }
            
            if (players == 0) {
                map.put(i, 0.0);
            } else {
                map.put(i, (double) count / players);   
                players -= count;
            }
        }
        
        List<Integer> keyList = new ArrayList<>(map.keySet());
        keyList.sort((o1, o2) -> Double.compare(map.get(o2), map.get(o1))); 

        return keyList.stream().mapToInt(Integer::intValue).toArray();
    }
}
