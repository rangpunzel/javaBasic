package z_exam;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		

		
		// 숫자를 입력받아 입력받은 숫자에 3자리 마다 콤마(,)를 붙여 출력해주세요.
		// 123456789 ->123,456,789
		
		// 사용자 입력창 생성
				Scanner s = new Scanner(System.in);
				
				System.out.println("숫자를 입력해주세요>");
				String input = s.nextLine();
				String temp = "";  

		        for (int i = 0; i < input.length(); i++) {
		            //input 길이를 이용하여 뒤에서 부터 숫자를 ch에 넣음
		            char ch = input.charAt(input.length()-i-1);
		            
		            //0을 3으로 나눠도 나머지가 0이 되므로 i가 0이 아닌 조건도 걸어야함
		            if (i != 0 && i%3 == 0) {
		                temp = ch + "," + temp;
		            }
		            else {
		                temp = ch + temp;
		            }

		        }

		        System.out.println(temp);
	
		
/*		for(int i = temp;i > 0; i-=3){
			
			String a = input.substring(i-3,i);
			
			System.out.println(a);
			}*/
			
			

		


	}
}