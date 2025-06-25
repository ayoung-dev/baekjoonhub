class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        
        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) ((ch - 'a' + n) % 26 + 'a');
            } else if (ch >= 'A' && ch <= 'Z') {
                ch = (char) ((ch - 'A' + n) % 26 + 'A');
            } 
            sb.append(ch);
        }
        
        return sb.toString();
    }
}
