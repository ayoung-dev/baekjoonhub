//import
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

      //scanner 선언
	  Scanner scanner = new Scanner(System.in);
      
      //문장 입력 받기 
      //.trim()을 이용하여 앞 뒤 공백 제거
      String Str = scanner.nextLine().trim();
        
      //scanner 닫기
      scanner.close();

      //공백으로 단어 구분해서 문자열에 넣기 
      String[] result = Str.split(" ");

      //결과 출력
      if (Str.isEmpty())
          System.out.println(0);
      else
          System.out.println(result.length);
  
	}
}