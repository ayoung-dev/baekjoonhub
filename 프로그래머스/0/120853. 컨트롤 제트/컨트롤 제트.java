class Solution {
    public int solution(String s) {
        int result = 0;
        
        String[] str = s.split(" ");
        for (int i = 0; i < str.length; i++) {
            if (!"Z".equals(str[i])) {
                result += Integer.parseInt(str[i]);
            } else {
                result -= Integer.parseInt(str[i - 1]);
            }
        }
        
        return result;
    }
}