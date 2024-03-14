import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int num;
        
        for (int a = 0; a < arr.length; a++) {
            arr[a] = a + 1;
        }
        
        for (int a = 0; a < M; a++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken()) - 1;
            int j = Integer.parseInt(st.nextToken()) - 1;
            while(i < j) {
                num = arr[i];
                arr[i++] = arr[j];
                arr[j--] = num;
            }
        }
        
        for (int a = 0; a < arr.length; a++) {
            System.out.print(arr[a] + " ");
        }
        
        br.close();
    }
}