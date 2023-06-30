import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] arr = new boolean[30];

        for(int i = 0; i < 28; i++) {
            int n = Integer.parseInt(br.readLine());
            arr[n-1] = true;
        }

        for(int j = 0; j < 30; j++){
            if(!arr[j]) {
                System.out.println(j+1);
            }
        }

        br.close();

    }
}