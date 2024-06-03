class Solution {
    public String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < numLog.length - 1; i++) {
            switch (numLog[i] - numLog[i+1]) {
                case -1:
                    sb.append("w");
                    break;
                case 1:
                    sb.append("s");
                    break;
                case -10:
                    sb.append("d");
                    break;
                default:
                    sb.append("a");
            }
        }
        
        return sb.toString();
    }
}