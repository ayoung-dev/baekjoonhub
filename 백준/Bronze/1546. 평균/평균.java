import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        double[] arr = new double[N];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        double max = Double.parseDouble(st.nextToken());
        arr[0] = max;
        double sum = 0;
        
        
        
        for (int i = 1; i < N; i++) { 
            arr[i] = Double.parseDouble(st.nextToken());
            max = Math.max(max, arr[i]);
        }
        
        for (int i = 0; i < N; i++) {
            arr[i] = arr[i]/max*100;
            sum += arr[i];
        }
        
        System.out.println(sum / N);
        
        br.close();
    }
}