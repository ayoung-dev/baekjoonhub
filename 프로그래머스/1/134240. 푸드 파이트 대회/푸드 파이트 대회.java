class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        StringBuilder rev = new StringBuilder();
        
        for (int i = 1; i < food.length; i++) {
            int count = food[i] / 2;
            
            while (count >= 1) {
                sb.append(i);
                count--;
            }
        }
        rev.append(sb);
        sb.append("0");
        sb.append(rev.reverse());
        
        return sb.toString();
    }
}