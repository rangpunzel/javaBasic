package e_oop;

public class Calculator {
	//5개의 산술연산을 각각 수행하는 5개의 메서드를 만들어주세요.
	//각 메서드는 2개의 파라미터를 받아 연산결과를 리턴해주세요.
	
	double plus(double a, double b){
		return a+b;
	}
	double minus(double a, double b){
		return a-b;
	}
	double multiply(double a, double b){
		return a*b;
	}
	double divide(double a, double b){
		return a/b;
	}
	double remainder(double a, double b){
		return a%b;
	}

}
