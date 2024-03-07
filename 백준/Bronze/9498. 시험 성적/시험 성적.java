import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int score = Integer.parseInt(br.readLine());
        
        System.out.println((score < 60) ? "F" : (score < 70) ? "D" : (score < 80) ? "C" : (score < 90) ? "B" : "A");
        
        br.close();
            
    }
}