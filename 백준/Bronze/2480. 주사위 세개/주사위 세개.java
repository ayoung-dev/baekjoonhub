//scanner import
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //scanner 선언
        Scanner scanner = new Scanner(System.in);
        
        //주사위 1 입력 받기
        int dice1 = scanner.nextInt();
        
        //주사위 2 입력 받기
        int dice2 = scanner.nextInt();
        
        //주사위 3 입력 받기
        int dice3 = scanner.nextInt();
        
        //상금 계산
        //만약 세 주사위의 눈이 같다면
        if (dice1 == dice2 && dice1 == dice3)
            System.out.println(10000 + (dice1 * 1000));
        
        //두 주사위의 눈이 같다면
        else if (dice1 == dice2 || dice2 == dice3 ) 
            System.out.println(1000 + (dice2 * 100));
        else if (dice1 == dice3)
            System.out.println(1000 + (dice1 * 100));
        
        //세 주사위의 눈이 모두 다르다면
        else 
            System.out.println(Math.max(dice1, Math.max(dice2, dice3)) * 100);
        
        //scanner 닫기
        scanner.close();

    }
}