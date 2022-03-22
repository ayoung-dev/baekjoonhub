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
        
        //1 ~ N 출력
        for (int i = N; i > 0; i--){
            System.out.println(i);
        }
        
        //scanner 닫기
        scanner.close();

    }
}