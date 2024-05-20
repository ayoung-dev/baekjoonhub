class Solution {
    public int solution(int[] num_list) {
        StringBuilder add = new StringBuilder();
        StringBuilder even = new StringBuilder();
        
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) even.append(num_list[i]);
            else add.append(num_list[i]);
        }
        
        return Integer.parseInt(even.toString()) + Integer.parseInt(add.toString());
    }
}