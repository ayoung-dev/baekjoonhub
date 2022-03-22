//scanner import
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //scanner 선언
        Scanner scanner = new Scanner(System.in);
        
        //N 입력 받기
        int N = scanner.nextInt();
        
        //구구단 출력
        for (int i = 1; i < 10; i++){
            System.out.println(N + " * " + i + " = " + (N  * i));
        }
        
        //scanner 닫기
        scanner.close();

    }
}