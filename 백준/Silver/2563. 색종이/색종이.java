import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int width = 0;
        
        boolean[][] arr = new boolean[100][100];
        
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            for (int j = x; j < x + 10; j ++) {
                for (int k = y; k < y + 10; k++) {
                    if (!arr[j][k]) {
                        arr[j][k] = true;
                        width++;
                    }
                }
            }
        }
        System.out.println(width);
    }
}