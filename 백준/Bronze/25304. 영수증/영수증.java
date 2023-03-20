//scanner import
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //scanner 선언
        Scanner scanner = new Scanner(System.in);
        
        //총 금액 입력 받기
        int entire = scanner.nextInt();
        
        //갯수 입력 받기
        int N = scanner.nextInt();
        
        //결과값 정의
        int sum = 0;
       
        for (int i = 0; i < N; i++){
            int fee = scanner.nextInt();
            int n = scanner.nextInt();
            int s = fee * n;
            sum += s;
        }
        
        String result = (sum == entire) ? "Yes" : "No";
        
        //결과 출력
        System.out.println(result);
        
        //scanner 닫기
        scanner.close();

    }
}