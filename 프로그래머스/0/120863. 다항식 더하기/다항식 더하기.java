class Solution {
    public String solution(String polynomial) {
        int xCount = 0;
        int count = 0;
        StringBuilder sb = new StringBuilder();
        
        String[] arr = polynomial.split("\\s*\\+\\s*");
        
        for (String s: arr) {
            if (s.contains("x")) {
                if ("x".equals(s)) {
                    xCount++;
                } else {
                    xCount += Integer.parseInt(s.substring(0, s.length() - 1));
                }
            } else {
                count += Integer.parseInt(s);
            }
        } 
        
        if (xCount > 0) {
            if (xCount == 1) sb.append("x");
            else sb.append(xCount).append("x");
        }

        if (count > 0) {
            if (xCount > 0) sb.append(" + ");
            sb.append(count);
        }

        return sb.toString();
    }
}