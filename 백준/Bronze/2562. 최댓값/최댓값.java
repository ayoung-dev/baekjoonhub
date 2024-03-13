//import
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        //scanner 선언
        Scanner scanner = new Scanner(System.in);
        
        //최댓값
        int max = 0;
        
        //최댓값 인덱스
        int maxIndex = 0;
        
        //9개 정수 입력받기
        for (int i = 1; i < 10; i++){
            int x = scanner.nextInt();
            if (x > max) {
                max = x;
                maxIndex = i;
            }
        }
        
        //최댓값 출력
        System.out.println(max);
        
        //최댓값 인덱스 출력
        System.out.println(maxIndex);
        
        //scanner 닫기
        scanner.close();

    }
}