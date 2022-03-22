//scanner import
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //scanner 선언
        Scanner scanner = new Scanner(System.in);
        
        //N 입력 받기
        int N = scanner.nextInt();
        
        //결과값 정의
        int sum = 0;
        
        //1~N까지 덧셈 계산
        for (int i = N; i > 0; i--){
            sum += i;
        }
        
        //결과 출력
        System.out.println(sum);
        
        //scanner 닫기
        scanner.close();

    }
}