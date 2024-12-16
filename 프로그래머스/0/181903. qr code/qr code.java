class Solution {
    public String solution(int q, int r, String code) {
        String result = "";
        
        for (int i  = 0; i < code.length(); i++) {
            int index = i % q;
            if (index == r) {
                result += code.charAt(i);
            }
        }
        
        return result;
    }
}