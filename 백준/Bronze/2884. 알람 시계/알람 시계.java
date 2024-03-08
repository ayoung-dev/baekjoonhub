import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        if (M >= 45)
            M -= 45;
        else {
            // M = M + 60 - 45
            M += 15;
            
            if (H < 1)
                H = 23;
            else
                H--;
        }
        
        System.out.println(H + " " + M);
        
        br.close();
    }
}