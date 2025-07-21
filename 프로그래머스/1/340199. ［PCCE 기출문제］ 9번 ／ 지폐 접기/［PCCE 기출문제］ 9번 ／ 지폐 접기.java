class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int wMax = Math.max(wallet[0], wallet[1]);
        int wMin = Math.min(wallet[0], wallet[1]);
        int bMax = Math.max(bill[0], bill[1]);
        int bMin = Math.min(bill[0], bill[1]);

        while(true) {
            if(wMax < bMax || wMin < bMin){
                bMax /= 2;
                answer++;
            }
            
            if (bMin > bMax) {
                int temp = bMax;
                bMax = bMin;
                bMin = temp;
            }
            
            if(bMax <= wMax && bMin <= wMin){
                break;
            }
        }
        
        return answer;
    }
}