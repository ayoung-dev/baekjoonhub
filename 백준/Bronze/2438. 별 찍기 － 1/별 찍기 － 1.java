//scanner import
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //scanner 선언
        Scanner scanner = new Scanner(System.in);
        
        //N 입력 받기
        int N = scanner.nextInt();
        
        //N만큼 * 출력
        for (int i = 1; i < N + 1; i++){
            //*N개씩
            for (int j = 0; j < i; j++)
                System.out.printf("*"); 
            //줄 바꾸기
            System.out.println();
        }
        
        
        //scanner 닫기
        scanner.close();

    }
}