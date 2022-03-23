//import
import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        //scanner 선언
        Scanner scanner = new Scanner(System.in);
        
        //N 입력 받기
        int N = scanner.nextInt();
        
        //N개의 수로 이루어진 1차원 배열
        int[] X = new int[N];
        
        //N개 정수 입력받아서 배열에 넣어주기
        for (int i = 0; i < N; i++){
            int x = scanner.nextInt();
            X[i] = x;
        }
        
        //배열 작은 수 부터 정렬
        Arrays.sort(X);
        
        //결과 출력
        System.out.println(X[0] + " " + X[X.length - 1]);
        
        //scanner 닫기
        scanner.close();

    }
}