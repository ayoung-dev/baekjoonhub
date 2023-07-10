import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        double num1 = Double.parseDouble(st.nextToken());
        
        double num2 = Double.parseDouble(st.nextToken());
        
        double result = num1 / num2;
        
        System.out.println(result);
        
        br.close();

    }
}