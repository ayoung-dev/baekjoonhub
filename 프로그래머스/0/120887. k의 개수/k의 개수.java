class Solution {
    public int solution(int i, int j, int k) {
        StringBuilder sb = new StringBuilder();
        
        for (int a = i; a <= j; a++) {
            sb.append(String.valueOf(a));
        }
        
        return sb.length() - sb.toString().replaceAll(String.valueOf(k), "").length();
    }
}