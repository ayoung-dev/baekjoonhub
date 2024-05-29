class Solution {
    public int solution(String[] s1, String[] s2) {
        int count = 0;
        
        for (String s: s1) {
            for (String st: s2) {
                if (s.equals(st)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}