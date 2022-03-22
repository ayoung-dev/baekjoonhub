//scanner import
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //scanner 선언
        Scanner scanner = new Scanner(System.in);
        
        //N 입력 받기
        int N = scanner.nextInt();
        
        //X 입력 받기
        int X = scanner.nextInt();
        
        //N개로 이루어진 수열 A 선언
        int[] A = new int[N];

        //N개로 이루어진 수열 A 입력
        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();
            A[i] = x;  
        }
        
        //수열 A 중 X보다 작은 수 출력
        for (int j = 0; j < N; j++) {
            if(A[j] < X)
                System.out.print(A[j] + " ");
        }
          
        //scanner 닫기
        scanner.close();

    }
}