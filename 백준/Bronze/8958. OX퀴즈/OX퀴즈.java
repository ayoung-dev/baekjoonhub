//import
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
	//scanner 선언
	Scanner scanner = new Scanner(System.in);
 
        //점수 결과 배열 선언
	String array[] = new String[scanner.nextInt()];
 
        //결과 입력 받아서 배열에 넣기
	for (int i = 0; i < array.length; i++) {
		array[i] = scanner.next();
	}
		
        //각 결과 점수 계산하기
	for (int i = 0; i < array.length; i++) {
			
		int count = 0;	// 연속 횟수
		int sum = 0;	// 전체 점수 
			
		for (int j = 0; j < array[i].length(); j++) {
				
			if (array[i].charAt(j) == 'O')
				count++;
			else
				count = 0;
                
                //전체 점수에 합하기
			sum += count;
		}
			
            	//결과 출력
		System.out.println(sum);
	}
        
        //scanner 닫기
	scanner.close();
	}
}
