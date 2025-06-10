class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        Long pToLong = Long.parseLong(p);
        int pLen = p.length();
        
        for (int i = 0; i <= t.length() - pLen; i++) {
            String str = t.substring(i, i + pLen);
            if (pToLong >= Long.parseLong(str)) answer++;
        }
        
        return answer;
    }
}