//import
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

    //scanner 선언
	Scanner scanner = new Scanner(System.in);
    
	//단어 입력 받기
	String Str = scanner.nextLine();
	
	//scanner 닫기
	scanner.close();
	
	//전체 걸리는 시간 
	int time = 0;
	
	//입력 받은 단어 하나씩 잘라서 시간 계산
	for (int i = 0; i < Str.length(); i++) {
		
		switch(Str.charAt(i)) {
		
		case 'A' : case 'B' : case 'C' :
			time += 3;
			break;
		
		case 'D' : case 'E' : case 'F' :
			time += 4;
			break;
		
		case 'G' : case 'H' : case 'I' :
			time += 5;
			break;
		
		case 'J' : case 'K' : case 'L' :
			time += 6;
			break;
			
		case 'M' : case 'N' : case 'O' :
			time += 7;
			break;
		
		case 'P' : case 'Q' : case 'R' : case 'S' :
			time += 8;
			break;
			
		case 'T' : case 'U' : case 'V' :
			time += 9;
			break;
		
		default :
			time += 10;
			
		}
	}
	
	//최소 시간 출력
	System.out.println(time);
	
	}
}