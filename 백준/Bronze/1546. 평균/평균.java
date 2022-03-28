//import
import java.util.Scanner;
import java.util.Arrays;

public class Main{
	    public static void main(String[] args){
	      //scanner 선언
	      Scanner scanner = new Scanner(System.in);
	        
          //과목 수 입력 받기
	      int sub = scanner.nextInt();
	        
	      //배열 선언
	      int[] array = new int[sub];
          
          //성적 입력 받아서 배열에 넣기
	        for (int i = 0; i < sub; i++){
	            //성적 입력 받기
	            int in = scanner.nextInt();
	        
	            //배열에 넣기
	            array[i] = in; 
	        }
	       
          //Max값 구하기
          Arrays.sort(array);
          double max = array[array.length - 1];
	        
          double sum = 0.0;
          
	      //배열 내 성적들 바꿔서 더하기
          for(int j = 0; j < array.length; j++){
              double num = (array[j] / max) * 100;
              sum += num;
          }
	        
          //평균
          double avr = sum / array.length;
          
	        //출력
	        System.out.println(avr);
	        
	        //scanner 닫기
	        scanner.close();

	  }
}