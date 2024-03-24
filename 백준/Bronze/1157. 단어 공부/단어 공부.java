import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] arr = new int[26];
        String S = br.readLine().toUpperCase();
        
        for (int i = 0; i < S.length(); i++) {
            arr[S.charAt(i) - 'A']++;
        }
        
        int max = -1;
        char ch = '?';
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 'A');
            } else if (arr[i] == max) {
                ch = '?';
            }
        }
        System.out.println(ch);
        br.close();
    }
}