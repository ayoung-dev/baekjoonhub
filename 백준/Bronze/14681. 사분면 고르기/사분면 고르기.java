//scanner import
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //scanner 선언
        Scanner scanner = new Scanner(System.in);
        
        //x 입력 받기
        int x = scanner.nextInt();
        
        //y 입력 받기
        int y = scanner.nextInt();
        
        //사분면 결정
        //x, y 모두 양수일 때
        if (x > 0 && y > 0)
            //1 출력
            System.out.println(1);
        
        //x는 음수이고 y는 양수일 때
        else if (x < 0 && y > 0)
            //2 출력
            System.out.println(2);
        
        //x, y 모두 음수일 때
        else if (x < 0 && y < 0)
            //3 출력
            System.out.println(3);
        
        //x는 양수이고 y는 음수일 때
        else
            //4 출력
            System.out.println(4);
        
        //scanner 닫기
        scanner.close();

    }
}