import java.util.*;

class Solution {
    public String solution(int a, int b) {
        int count = 0;
        
        Map<Integer, String> days = new HashMap<>();
        days.put(0, "THU");
        days.put(1, "FRI");
        days.put(2, "SAT");
        days.put(3, "SUN");
        days.put(4, "MON");
        days.put(5, "TUE");
        days.put(6, "WED");
        
        for (int i = 1; i < a; i++) {
            if (i == 2) count += 29;
            else if (i == 8) count += 31;
            else if (i < 8) {
                if (i % 2 == 1) {
                    count += 31;
                } else {
                    count += 30;
                }
            } else {
                if (i % 2 == 1) {
                    count += 30;
                } else {
                    count += 31;
                }
            }
        }
        count += b;
        
        return days.get(count % 7);
    }
}