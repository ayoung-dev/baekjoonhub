class Solution {
    public int solution(String A, String B) {
        int len = A.length();
        
        for (int i = 0; i < len; i++) {
            if (B.equals(A)) return i;
            A = A.substring(len - 1) + A.substring(0, len - 1);
        }
        return -1;
    }
}