//import
	import java.util.Scanner;

public class Main{
	    public static void main(String[] args){
	        //scanner 선언
	        Scanner scanner = new Scanner(System.in);
	        
	        int count = 0;
	        
	        //배열 선언
	        int[] array = new int[10];
	        
	        for (int i = 0; i < 10; i++){
	            //숫자 입력 받기
	            int in = (scanner.nextInt()) % 42;
	        
	            //배열에 넣기
	            array[i] = in; 
	        }
	       
	        
	        for(int j = 0; j < array.length; j++){
	            //break 체크용
	            int check = 0;
	            
	            for (int k = j; k < array.length; k++){
	                if (array[j] == array[k])
	                    check++;
	                
	            }
	            if(check < 2) 
	            	count++;
	                
	        }
	        
	        //출력
	        System.out.println(count);
	        
	        //scanner 닫기
	        scanner.close();

	  }
}