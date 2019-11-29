package z_exam;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		

		
		// 숫자를 입력받아 입력받은 숫자에 3자리 마다 콤마(,)를 붙여 출력해주세요.
		// 123456789 ->123,456,789
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요>");
		String input = s.nextLine();
		

		
		
		int temp = input.length();       //입력받은 숫자의 길이 저장
		
		String numbers[] = new String[temp];
		
		
		for(int i = temp;i <= 0;i--){
			for(int j = 0; j < temp;j++){
	       numbers[j] = input[i];
		
			}
		}		
		
/*		for(int i = temp;i > 0; i-=3){
			
			String a = input.substring(i-3,i);
			
			System.out.println(a);
			}*/
			
			

		


	}
}