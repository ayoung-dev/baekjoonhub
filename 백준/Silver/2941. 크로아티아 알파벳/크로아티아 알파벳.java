import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String S = br.readLine();
        
        String arr[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        
        for (int i = 0; i < arr.length; i++) {
            if (S.contains(arr[i])) {
                S = S.replace(arr[i], "!");
            }
        }
        
        System.out.println(S.length());
        
        br.close();
    }
}