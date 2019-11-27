package c_statement;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		// 숫자 야구 게임을 만들어주세요.
		Scanner scn = new Scanner(System.in);

		int input = 0;

		// 랜덤 숫자 생성

		int answer1 = (int) (Math.random() * 9) + 1;
		int answer2 = (int) (Math.random() * 9) + 1;
		int answer3 = (int) (Math.random() * 9) + 1;

		// 값이 중복되면 다시 생성
		
		if (answer1 == answer2 || answer2 == answer3 || answer1 == answer3) {

			answer1 = (int) (Math.random() * 9) + 1;
			answer2 = (int) (Math.random() * 9) + 1;
			answer3 = (int) (Math.random() * 9) + 1;

		} else {

			int result = answer1 * 100 + answer2 * 10 + answer3;

			int inputa, inputb, inputc = 0;
			int s, b, o;

			do {
				System.out.println("숫자를 입력해주세요 >");
				input = Integer.parseInt(scn.nextLine());

				inputa = input / 100;
				inputb = (input / 10) % 10;
				inputc = input % 10;
				
				s = 0;
				b = 0;
				o = 0;
				
				//첫번째자리
				if(inputa == answer1){
					s += 1;
				}else if (inputa == answer2 || inputa == answer3){
					b += 1;
				}else if (inputa != answer1 && inputa != answer2 && inputa != answer3){
					o += 1;
				}
				
				//두번째자리
				if(inputb == answer2){
					s += 1;
				}else if (inputb == answer1 || inputb == answer3){
					b += 1;
				}else if (inputb != answer1 && inputb != answer2 && inputb != answer3){
					o += 1;
				}
				
				//세번째자리
				if(inputc == answer3){
					s += 1;
				}else if (inputc == answer1 || inputc == answer2){
					b += 1;
				}else if (inputc != answer1 && inputc != answer2 && inputc != answer3){
					o += 1;
				}

				System.out.println("S = " + s + " B = " + b + " O = " + o);

			} while (input != result);
			System.out.println("정답입니다.");
		}

	}
}
