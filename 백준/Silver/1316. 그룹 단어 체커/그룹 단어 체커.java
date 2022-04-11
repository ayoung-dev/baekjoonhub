//import
import java.util.Scanner;
 
public class Main {
 
    	//scanner 선언
	static Scanner scanner = new Scanner(System.in);
 
	public static void main(String[] args) {
 
        	//그룹 단어 카운트
		int count = 0;
        
        	//단어 갯수 입력 받기
		int N = scanner.nextInt();
 
        	//단어 갯수만큼 반복문
		for (int i = 0; i < N; i++) {
            		//그룹 함수가 true이면
			if (group() == true) {
                		//카운트
				count++;
			}
		}
        
        	//카운트 출력하기
		System.out.println(count);
	}
 
    
    	//그룹단어 함수 생성
	public static boolean group() {
		boolean[] check = new boolean[26];
		int prev = 0;
        
        	//단어 입력 받기
		String str = scanner.next();
		
        	//단어 길이만큼 반복문
		for(int i = 0; i < str.length(); i++) {
            
           		//단어 하나씩 자르기
			int now = str.charAt(i);
			
			// 이전 문자랑 지금 문자가 다르면
			if (prev != now) {		
				
				// 해당 문자가 처음 나오는 경우
				if (check[now - 'a'] == false ) {
                    			//배열값 true로 변경
					check[now - 'a'] = true;
                    			//이전값을 지금값으로
					prev = now;					
				}
	 
				// 해당 문자가 이미 나온 적이 있는 경우 
				else {
                    			//함수 종료
					return false;
				}
			} 
	        
			// 연속된 문자라면
			else {
               			//함수 계속
				continue;
			}
		}    
		return true;
	}
}
