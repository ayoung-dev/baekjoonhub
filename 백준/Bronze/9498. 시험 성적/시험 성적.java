//scanner import
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //scanner 선언
        Scanner scanner = new Scanner(System.in);
        
        //성적 입력 받기
        int score = scanner.nextInt();
        
        //90~100일 경우
        if (score >= 90)
            System.out.println("A");
        
        //80~89일 경우
        else if (score >= 80)
            System.out.println("B");
        
        //70~79일 경우
        else if (score >= 70)
            System.out.println("C");
        
        //60~69일 경우
        else if (score >= 60)
            System.out.println("D");
        
        //그 이하일 경우
        else
            System.out.println("F");

        
        //scanner 닫기
        scanner.close();

    }
}