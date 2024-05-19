import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        int count = 0;
        
        if(N == 1) {
            count = 1;
        } else {
            while (N > 1) {
                N = N - (6 * count);
                count++;
            }
        }
        
        System.out.println(count);
        
        br.close();
    }
}