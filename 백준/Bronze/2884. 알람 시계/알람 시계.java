//scanner import
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //scanner 선언
        Scanner scanner = new Scanner(System.in);
        
        //H 입력 받기
        int H = scanner.nextInt();
        
        //M 입력 받기
        int M = scanner.nextInt();
        
        //알람 시간 계산
        //만약 M이 45보다 작다면
        if (M < 45){
            H--;
            M = 60 - (45 - M);
            //만약 H가 0보다 작다면
            if (H < 0)
                 H = 23; 
            //알람 시간 출력
            System.out.println(H+ " " +M);
        } 
        //둘 다 아니라면
        else
            System.out.println(H+ " " + (M - 45));
        
        //scanner 닫기
        scanner.close();

    }
}