class Solution {
    public int solution(String s) {
        int answer = 0;
        
        while(!s.isEmpty()) {
            char[] ch = s.toCharArray();
            char x = ch[0];
            
            int xCount = 1;
            int other = 0;
            int i = 1;
            
            for (; i < ch.length; i++) {
                if (ch[i] == x) xCount++;
                else other++;
            
                if (xCount == other) break;
            }
            answer++;
            
            if (i + 1 >= s.length()) break;
            s = s.substring(i + 1);
        }
        return answer;
    }
}