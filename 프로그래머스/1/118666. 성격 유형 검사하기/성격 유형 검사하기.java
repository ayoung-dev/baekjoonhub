import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<String, Integer> personal = new HashMap<>();
        personal.put("R", 0);
        personal.put("T", 0);
        personal.put("C", 0);
        personal.put("F", 0);
        personal.put("J", 0);
        personal.put("M", 0);
        personal.put("A", 0);
        personal.put("N", 0);
        
        for (int i = 0; i < survey.length; i++) {
            if (choices[i] == 4) continue;
            
            String s = survey[i];
            int point = Math.abs(choices[i] - 4);
            
            if (choices[i] < 4) {
                s = survey[i].substring(0, 1);
            } else {
                s = survey[i].substring(1);
            }
            personal.compute(s, (key, val) -> val + point);
        }
        
        String result = pick(personal, "R", "T")
                      + pick(personal, "C", "F")
                      + pick(personal, "J", "M")
                      + pick(personal, "A", "N");
        
        return result;
    }
    
    private static String pick(Map<String, Integer> map, String a, String b) {
        int av = map.get(a), bv = map.get(b);
        
        if (av > bv) return a;
        if (bv > av) return b;

        return a.compareTo(b) < 0 ? a : b;
    }
}