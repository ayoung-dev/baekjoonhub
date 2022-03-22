//scanner import
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //scanner 선언
        Scanner scanner = new Scanner(System.in);
        
        //T 입력 받기
        int T = scanner.nextInt();
        
        //T만큼 숫자 입력 받기
        for (int i = 1; i < T + 1; i++){
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            
            //두 수 더한 값 출력
            System.out.println("Case #" + i + ": " + (A + B));
        }
        
        //scanner 닫기
        scanner.close();

    }
}