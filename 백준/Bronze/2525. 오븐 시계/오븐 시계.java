//scanner import
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //scanner 선언
        Scanner scanner = new Scanner(System.in);
        
        //현재 H 입력 받기
        int H = scanner.nextInt();
        
        //현재 M 입력 받기
        int M = scanner.nextInt();
        
        //요리 시간 입력 받기
        int T = scanner.nextInt();
        
        //끝나는 시간 계산
        //만약 M + T가 60보다 크다면
        if (M + T > 59){
            H += (M + T) / 60;
            M = (M + T) % 60;
            //만약 H가 23보다 크다면
            if (H > 23)
                 H -= 24; 
            //끝나는 시간 출력
            System.out.println(H+ " " +M);
        } 
        //둘 다 아니라면
        else
            System.out.println(H+ " " + (M + T));
        
        //scanner 닫기
        scanner.close();

    }
}