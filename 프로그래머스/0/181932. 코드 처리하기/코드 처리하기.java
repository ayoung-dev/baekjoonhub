class Solution {
    public String solution(String code) {
        StringBuilder ret = new StringBuilder();
        boolean mode = true;
        
        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '1') {
                mode = !mode;
                continue;
            }

            if (mode) {
                if (i % 2 == 0) ret.append(code.charAt(i));
            }
            else {
               if (i % 2 != 0) ret.append(code.charAt(i));  
            }
        }
    return ret.length() == 0 ? "EMPTY" : ret.toString();
    }
}