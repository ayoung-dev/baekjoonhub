import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = l; i <= r; i++) {
            if (isOnlyFiveAndZero(i)) {
                list.add(i);
            }
        }
        if (list.isEmpty()) return new int[]{-1};
        else return list.stream().mapToInt(Integer::intValue).toArray();
    }
    
    private boolean isOnlyFiveAndZero(int num) {
        String str = String.valueOf(num);
        
        for (char ch: str.toCharArray()) {
            if (ch != '0' && ch != '5') {
                return false;
            }
        }
        return true;
    }
}