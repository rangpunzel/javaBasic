package e_oop;

import java.util.Scanner;

public class Hangman {

	public static void main(String[] args) {
		
		Hangman hm = new Hangman();

		hm.levelChoice();
	
	}

	Scanner s = new Scanner(System.in);
	
	String level1[] = 
		{"new", "book", "king", "carrots", "pumpkin","cabbage","onion","potato","ginger","plum"};
	String level1Hint[] = 
		{"새로운", "책","왕","당근","호박","양배추","양파","감자","생강","자두"};
	
	String level2[] = {"ignore","discount","transfer","forced","cylinder","dictator"};
	String level2Hint[] = {"무시하다","할인하다. 할인","환승하다","강제적인, 강요된","원통, 원기둥","독재자"};
	
	String level3[] = {"desolate","embargo","nationalist","outrageous"};
	String level3Hint[] = {"황량한, 적막한 너무나 외로운","금수(禁輸) 조치, 통상 금지령","독립주의자","너무나 충격적인, 언어도단인"};
	

	int randomNum = 0;
	String answer = "";
	int count = 0;
	
	String input = "";
	char firstLetter = ' ';
	char shuffle[];
	
	
	void levelChoice(){     //난이도 선택 메서드
		System.out.println("난이도를 선택해주세요.(Easy=1  Nomal=2   Hard=3)");
		int lcinput = (int)Integer.parseInt(s.nextLine());
		
		if(lcinput == 1){
			level1();
		}else if(lcinput == 2){
			level2();
		}else if(lcinput == 3){
			level3();
		}else{
			System.out.println("다시 입력해주세요.");
			this.levelChoice();
		}
		
		
	}
	
	char[] shuffle(String a){     //셔플힌트 메서드
		
		for(int i = 0; i < a.length();i++){
			shuffle = a.toCharArray();
				}

		for(int j = 0; j < 10;j++){
			int sr = (int)(Math.random()*shuffle.length);
		    char tmp = shuffle[0];
			shuffle[0] = shuffle[sr];
			shuffle[sr] = tmp;	
					}
		return shuffle;
	}
	
	void main(String ss, String sh){
		int a = ss.length();

		do{
			System.out.println("글자 수 : " + a +"  첫글자 : " + firstLetter + " 시도 횟수 : " + count);
			answer = ss;
			input =	s.nextLine();


			if(!input.equals(answer) && count < 10){
			
				hangManDie();
				
				if(count > 2 && count < 9){
					
					System.out.print("셔플 힌트 : ");
					System.out.println(shuffle);
			    }
				else if(count > 8){
					System.out.print("셔플 힌트 : ");
					System.out.print(shuffle);
					System.out.println("\t한글힌트 : " + sh);
					}
				 System.out.println("틀렸어요~");

				}else if(count == 10){
					break;
				}					count++;

			}while(!input.equals(answer));
	}

	
	void level1(){
		
		//레벨1 단어 랜덤돌리기
		randomNum = (int)(Math.random()*level1.length);

		System.out.println("답을 입력해주세요(소문자)");
		
		//첫글자 
		firstLetter = level1[randomNum].charAt(0);

		//글자 셔플
		shuffle(level1[randomNum]);
		main(level1[randomNum],level1Hint[randomNum]);
		answer(answer);
	}
	
	
	void level2(){
		
		//레벨2 단어 랜덤돌리기
		randomNum = (int)(Math.random()*level2.length);

		System.out.println("답을 입력해주세요(소문자)");
		
		//첫글자 
		firstLetter = level2[randomNum].charAt(0);
		
		//글자 셔플
		shuffle(level2[randomNum]);

		main(level2[randomNum],level2Hint[randomNum]);
		
		answer(answer);
	}
	
	void level3(){
		
		//레벨3 단어 랜덤돌리기
		randomNum = (int)(Math.random()*level3.length);

		System.out.println("답을 입력해주세요(소문자)");

		//첫글자 
		firstLetter = level3[randomNum].charAt(0);

		//글자 셔플
		shuffle(level3[randomNum]);

		main(level3[randomNum],level3Hint[randomNum]);
		answer(answer);
		
	}
	
	
	
	void answer(String a){   //정답처리
		if(input.equals(a)){
			System.out.println("정답입니다.");
			regame();
		}else{
			System.out.println("HangMan Die..");
			System.out.println("정답은 " + a + "입니다.");
			regame();
		}
	}

	
	void regame(){  
		System.out.println("재 도전 하시겠습니까?(Y/N)");
		
		input = s.nextLine();
		if(input.equals("Y") || input.equals("y")){
			count = 1;
			levelChoice();
		}else if (input.equals("N") || input.equals("n")){
			System.out.println("Game Over");
	
		}else
		{
			System.out.println("Y 또는 N 을 적어주세요.");
			regame();
		}
	}
	
	void hangManDie(){
		
		switch (count){
			case 0:
				System.out.println("     ");
				System.out.println("                ");
				System.out.println("              O   ");
				System.out.println("                ");
				System.out.println("                 ");
				System.out.println("                     ");
				System.out.println("             ");
				break;
			case 1:
				System.out.println("     ");
				System.out.println("                ");
				System.out.println("              O   ");
				System.out.println("              |   ");
				System.out.println("                 ");
				System.out.println("                     ");
				System.out.println("             ");
				break;
			case 2:
				System.out.println("                ");
				System.out.println("                ");
				System.out.println("              O   ");
				System.out.println("            / |   ");
				System.out.println("                 ");
				System.out.println("                     ");
				System.out.println("             ");
				break;
			case 3:
				System.out.println("     ");
				System.out.println("                ");
				System.out.println("              O   ");
				System.out.println("            / | ＼  ");
				System.out.println("                 ");
				System.out.println("                     ");
				System.out.println("             ");
				break;
			case 4:
				System.out.println("     ");
				System.out.println("                ");
				System.out.println("              O   ");
				System.out.println("            / | ＼  ");
				System.out.println("             /    ");
				System.out.println("            /         ");
				System.out.println("             ");
				break;
			case 5:
				System.out.println("     ");
				System.out.println("                ");
				System.out.println("              O   ");
				System.out.println("            / | ＼  ");
				System.out.println("             /＼     ");
				System.out.println("            /   ＼  ");
				System.out.println("             ");
				break;
			case 6:
				System.out.println("     ");
				System.out.println("                ");
				System.out.println("              O   ");
				System.out.println("            / | ＼  ");
				System.out.println("             /＼     ");
				System.out.println("            /   ＼  ");
				System.out.println("   -----          ");
				break;
			case 7:
				System.out.println("     ");
				System.out.println("    |           ");
				System.out.println("    |         O   ");
				System.out.println("    |       ／ | ＼  ");
				System.out.println("    |        /＼     ");
				System.out.println("    |       ／       ＼  ");
				System.out.println("   -----          ");
				break;
			case 8:
				System.out.println("          ＋ㅡㅡㅡㅡㅡㅡㅡ      ");
				System.out.println("    |           ");
				System.out.println("    |         O   ");
				System.out.println("    |       ／ | ＼  ");
				System.out.println("    |        /＼     ");
				System.out.println("    |       ／       ＼  ");
				System.out.println("   -----          ");
				break;
			case 9:
				System.out.println("          ＋ㅡㅡㅡㅡㅡㅡㅡ      ");
				System.out.println("    |         |  ");
				System.out.println("    |         O   ");
				System.out.println("    |       ／ | ＼  ");
				System.out.println("    |        /＼     ");
				System.out.println("    |       ／       ＼  ");
				System.out.println("   -----          ");
				break;
				}

	}

	

	

}