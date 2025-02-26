class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        while (true) {
            int[] newArr = arr.clone(); 
            boolean changed = false;
            
            for (int i = 0; i < arr.length; i++) {
                int num = arr[i];
                if (num >= 50 && num % 2 == 0) {
                    newArr[i] = num / 2;
                    changed = true;
                } else if (num < 50 && num % 2 != 0) {
                    newArr[i] = num * 2 + 1;
                    changed = true;
                }
            }
            
            if (!changed) break; 
            answer++;
            arr = newArr; 
        }
        
        return answer;
    }
}