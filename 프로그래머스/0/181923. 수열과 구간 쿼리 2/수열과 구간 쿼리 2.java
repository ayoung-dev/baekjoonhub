class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int length = queries.length;
        int[] answer = new int[length];
        
        for (int i = 0; i < length; i++) {
            int[] query = queries[i];
            int num = Integer.MAX_VALUE;
            
            for (int j = query[0]; j <= query[1]; j++) {
                if (arr[j] > query[2] && arr[j] < num) num = arr[j];
            }
            
            if (num == Integer.MAX_VALUE) answer[i] = -1;
            else answer[i] = num;
        }
        
        return answer;
    }
}