import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		int[] chess = {1, 1, 2, 2, 2, 8};
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		
		int[] out = new int[6];
		
		for (int i = 0; i < chess.length; i++) {
			
			out[i] = chess[i] - Integer.parseInt(st.nextToken());
			
			System.out.print(out[i] + " ");
		}
	}
}