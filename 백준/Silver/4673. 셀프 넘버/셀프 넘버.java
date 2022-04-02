public class Main {
 
	public static void main(String[] args) {
        
        //1~1000 check 배열 생성
	boolean[] check = new boolean[10001];	// 1부터 10000이므로
 
        //1~1000까지 함수 d(n) 적용
	for (int i = 1; i < 10001; i++){
		int n = d(i);
            
            	//결과가 1000 이하인 것만
		if(n < 10001){	
                	//배열에서 해당 숫자번째 true로
			check[n] = true;
		}
	}
        
        //1~1000까지 check 배열에서
	for (int i = 1; i < 10001; i++) {
            //false인 값만 출력 --> 셀프 넘버
		if (!check[i])	
                	System.out.println(i);
        }
	}
 
    	//d(n)함수 정의
	public static int d(int number){
		int out = number;
    
        //1000까지니까 
	while(number != 0){
		out = out + (number % 10); // 가장 앞자리수 더하기
		number = number / 10;	// 앞자리수 없애기
	}
    
        //원래 숫자에 각 자리수가 더해진 out 출력
	return out;
	}
}  
