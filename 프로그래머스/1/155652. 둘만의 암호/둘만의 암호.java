class Solution {
    public String solution(String s, String skip, int index) {
        char[] ch = s.toCharArray();
        
        for (int i = 0; i < ch.length; i++) {
            int plus = 0;
            int count = 0;
            while (count < index) {
                ch[i]++;
                if (ch[i] > 'z') ch[i] = 'a';
                if (!skip.contains(String.valueOf(ch[i]))) {
                    count++;
                }
            }
        }
        
        return new String(ch);
    }
}
