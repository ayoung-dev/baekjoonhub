//import
import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        //scanner 선언
        Scanner scanner = new Scanner(System.in);
        
        //A 입력 받기
        int A = scanner.nextInt();
        
        //B 입력 받기
        int B = scanner.nextInt();
        
        //C 입력 받기
        int C = scanner.nextInt();
        
        //곱셈 계산하기
        int sum = A * B * C;
        
        //String으로 형변환
        String strSum = Integer.toString(sum);
        
        //0 ~ 9 갯수 count
        for (int i = 0; i < 10; i++) {
			int count = 0;
            //곱셈 결과 중 한 자리씩 가져와서 일치하면 count++
			for (int j = 0; j < strSum.length(); j++) {
				if ((strSum.charAt(j) - '0') == i) {
					count++;
				}
			}
			System.out.println(count);
		}
        
        //scanner 닫기
        scanner.close();

    }
}
