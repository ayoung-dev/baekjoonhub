//import
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

      //scanner 선언
	 Scanner scanner = new Scanner(System.in);
      
      //단어 입력 받기 
      String S = scanner.next();
      
      //단어 모두 소문자로 바꾸기
      String down = S.toLowerCase();
      
      //a~z 횟수 배열 만들기
      int[] alpha = new int[26];

      //down 문자열 하나씩 잘라서 알파벳 count
      for(int i = 0; i < down.length(); i++) {    
          char ch = down.charAt(i);
          alpha[ch - 'a']++;
		}
      
      int max = 0;
      int maxIndex = 0;
      
      //배열에서 가장 큰 수를 가진 알파벳 출력
      for (int j = 0; j < alpha.length; j++) {
          if (alpha[j] > max) {
              max = alpha[j];
              maxIndex = j;
          }
          else if (alpha[j] == max) {
              maxIndex = -2;
          }
       }
      
      //int를 다시 아스키코드로 바꿔주기 
      char cvChar = (char)(maxIndex + 'A');
      
      //결과 출력
      System.out.println(cvChar);
     
      //scanner 닫기
      scanner.close();
	}
}
