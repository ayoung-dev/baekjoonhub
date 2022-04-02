//import
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
	//scanner 선언
	Scanner scanner = new Scanner(System.in);
        
        //테스트 수 입력 받기
        int testcase = scanner.nextInt();
        
        //테스트 배열 선언
		int[] array;
        
        //각 테스트 계산
        for (int i = 0; i < testcase; i++) {
            //평균 계산을 위한 합
            double sum = 0.0;
            //확률 
            double per = 0.0;
            
            //각 테스트 결과 갯수
            int test = scanner.nextInt();
            
            array = new int[test];
            
            for (int j = 0; j < test; j++) {
                array[j] = scanner.nextInt();
                //각 테스트 결과 모두 더하기
                sum += array[j];
            }
            
            //평균
            double avr = sum / test;
            
            //평균 넘는 확률 구하기
            for (int k = 0; k < test; k++) {
                if (array[k] > avr)
                    per++;
            }
            //결과 출력 
            System.out.printf("%.3f%%\n",(per / test) * 100);
        } 
        
        //scanner 닫기
	scanner.close();
	}
}
