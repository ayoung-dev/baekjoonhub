import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> arryList = new ArrayList<>();
        
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                while(n % i == 0) {
                    n /= i;
                }
                arryList.add(i);
            }
        }
        
        int[] answer = arryList.stream().mapToInt(x -> x).toArray();
        
        return answer;
    }
}