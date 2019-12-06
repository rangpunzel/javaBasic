package e_oop;

public class ClassMaker2 {
	
	public static void main(String[] args) {
		ClassMaker2 cm = new ClassMaker2();
		System.out.println(cm.i);
		
	}

	//전역변수 하나를 선언하고 명시적으로 초기화 해주세요.
	String i = "명시적 초기화";
	
	//위에서 선언한 전역변수를 초기화 블럭을 해용해 초기화 해주세요.
	{
		i = "초기화 블럭";
	}

	
	//위에서 선언한 전역변수를 생성자의 파라미터를 사용해 초기화 해주세요.
	ClassMaker2(String i){
		this.i = i;
	}
	
	
	//위에서 선언한 전역변수를 생성자를 하나 더 만들어서 초기화 해주세요.
	ClassMaker2(){
//		this("생성자 초기화");
	}
	
	//초기화블럭과 명시적 초기화는 위에 있는게 먼저 실행됨
	//생성자는 마지막에 실행
	

}
