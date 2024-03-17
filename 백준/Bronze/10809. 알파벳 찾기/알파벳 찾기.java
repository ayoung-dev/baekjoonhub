//import
import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
	public static void main(String[] args) {
 
        //scanner 선언
		Scanner scanner = new Scanner(System.in);
        
        //S 입력받기 
        String s = scanner.next();
        
        //위치 넣어둘 배열 생성
        int[] array = new int[26]; 
        
        //array 모든 element -1로 초기화
        Arrays.fill(array, -1);
        
        for(int i = 0; i < s.length(); i++){
            //S 하나씩 잘라서
            char ch = s.charAt(i);
            
            //만약 값이 -1 이라면! (첫 번째 나타난 위치를 받기 위해)
            if(array[ch - 'a'] == -1)
                //index값 해당 배열의 값으로 넣어주기
		        array[ch - 'a'] = i;
        }
            
        //결과 출력
        for(int i = 0; i < array.length; i++) {	
			System.out.print(array[i] + " ");
		}
        
        //scanner 닫기
        scanner.close();
	}
}