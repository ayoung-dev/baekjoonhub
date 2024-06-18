class Solution {
    public int solution(int[] array) {
        StringBuilder sb = new StringBuilder();
        
        for (int i: array) {
            sb.append(i);
        }
        
        return sb.length() - sb.toString().replace("7", "").length();
    }
}