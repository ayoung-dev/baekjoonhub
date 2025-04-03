// import java.util.Arrays;

// class Solution {
//     public int[][] solution(int[][] arr) {
//         int max = Math.max(arr.length, arr[0].length);
//         int min = Math.min(arr.length, arr[0].length);
        
//         if (max == min) return arr;
        
//         int[][] answer = new int[max][max];
        
//         for (int i = 0; i < max; i++) {
//             Arrays.fill(answer[i], 0);
//         }
        
//         for (int i = 0; i < max; i++) {
//             for (int j = 0; j < min; j++) {
//                 if (max == arr.length)
//                     answer[i][j] = arr[i][j];
//                 else 
//                     answer[j][i] = arr[j][i];
//             }
//         }
        
//         return answer;
        
//     }
// }

class Solution {
    public int[][] solution(int[][] arr) {
        int max = Math.max(arr.length, arr[0].length);
        int[][] array = new int[max][max];

        for (int i = 0; i < arr.length; i++) {
            System.arraycopy(arr[i], 0, array[i], 0, arr[0].length);
        }
        return array;
    }
}