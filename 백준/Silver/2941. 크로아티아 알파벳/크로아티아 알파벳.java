//import
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
    
        //scanner 선언
		Scanner scanner = new Scanner(System.in);
        
        //단어 입력받기
		String str = scanner.nextLine();
        
        //문자 갯수 카운트
		int count = 0;
 
        //문자 갯수 세는 반복문
		for (int i = 0; i < str.length(); i++) {
            //문자 하나씩 자르기
			char ch = str.charAt(i);
 
            //c일 경우
			if(ch == 'c') {
				if(i < str.length() - 1) {
                    //만약 다음 문자가 = 또는 - 이라면 --> 즉 c= 또는 c-이면
					if(str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-') {
						//=, - 까지 한 문자로 취급
						i++;		
					}
				}
			}
		    
            //d일 경우
			else if(ch == 'd') {
				if(i < str.length() - 1) {
                    //다음 문자가 z면
					if(str.charAt(i + 1) == 'z') {
						if(i < str.length() - 2) {
                            //다음 문자가 = 이면 --> 즉, dz= 이면
							if(str.charAt(i + 2) == '=') {
                                //한 문자로 취급
								i += 2;
							}
						}
					}
		            //만약 다음 문자가 - 이면 --> 즉, d- 이면
					else if(str.charAt(i + 1) == '-') {	
                        //한 문자로 취급
						i++;
					}
				}
			}
            
		    //l일 경우
			else if(ch == 'l') {
				if(i < str.length() - 1) {
                    //다음 문자가 j이면 --> 즉, lj이면
					if(str.charAt(i + 1) == 'j') {
                        //한 문자로 취급
						i++;
					}
				}
			}
		    
            //n일 경우
			else if(ch == 'n') {
				if(i < str.length() - 1) {
                    //다음 문자가 j이면 --> 즉, nj이면
					if(str.charAt(i + 1) == 'j') {
                        //한 문자로 취급
						i++;
					}
				}
			}
 
            //s일 경우
			else if(ch == 's') {
				if(i < str.length() - 1) {
                    //다음 문자가 =이면 --> 즉, s=이면
					if(str.charAt(i + 1) == '=') {	
                        //한 문자로 취급
						i++;
					}
				}
		    }
            
            //z일 경우
			else if(ch == 'z') {
				if(i < str.length() - 1) {
                    //다음 문자가 =이면 --> 즉, z=이면
					if(str.charAt(i + 1) == '=') {
                        //한 문자로 취급
						i++;
					}
				}
			}
		    
			count++;
 
		}
        
        //scanner 닫기
        scanner.close();
        
        //카운트 출력
		System.out.println(count);
        
        
	}
}