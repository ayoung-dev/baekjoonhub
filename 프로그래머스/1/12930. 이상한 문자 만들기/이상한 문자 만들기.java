class Solution {
    public String solution(String s) {
        String[] str = s.split("");
        StringBuilder sb = new StringBuilder();
        int count = 1;
        
        for (String alpha:str) {
            if (alpha.isBlank()) {
                count = 1;
                sb.append(alpha);
                continue;
            }
            
            if (count % 2 == 0) {
                sb.append(alpha.toLowerCase());
            } else {
                sb.append(alpha.toUpperCase());
            }
            count++;
        }
        
        return sb.toString();
    }
}