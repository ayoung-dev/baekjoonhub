class Solution {
    public int[] solution(int[] num_list) {
        
        int add = 0, even = 0;
        int[] answer = new int[2];
        
        for (int i: num_list) {
            if (i % 2 == 0) {
                even++;
            } else {
                add++;
            }
        }
        
        answer[0] = even;
        answer[1] = add;
        
        return(answer);
    }
}