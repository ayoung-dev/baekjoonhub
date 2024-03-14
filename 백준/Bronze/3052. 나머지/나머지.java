import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] arr = new int[10];
        int count = 0;
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (Integer.parseInt(br.readLine()) % 42);
        }
        
        for (int i = 0; i < arr.length; i++) {
            boolean b = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    b = true;
                    break;
                }
            }
            if (b == false) {
                count++;
            }
        }
        System.out.println(count);
        br.close();
    }
}