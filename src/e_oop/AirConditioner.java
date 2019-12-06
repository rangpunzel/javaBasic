package e_oop;

public class AirConditioner {
	
	public static void main(String[] args) {
		
		
		AirConditioner ac = new AirConditioner();
		


		ac.power();
		ac.power();
		
		ac.temperatureUp();

		ac.temperatureDown();
		
		ac.airVolume();

		System.out.println("전원 " + ac.power);
		System.out.println("온도 " + ac.temperature);
		System.out.println("풍량 " + ac.airVolume);
		
	}
	
	boolean power; // 전원
	int temperature; //온도
	int airVolume; // 풍량
	
	AirConditioner(){
		//변수 초기화
		power = false;
		temperature = 24;
		airVolume = 1;
	}
	
	//전원 버튼
	void power(){
		power = !power;
	}
	
	//온도 +버튼
	void temperatureUp(){
		if(power && temperature <= 30){
		temperature++;
		}else{
			temperature = 0;
		}
	}
	
	//온도 -버튼
	void temperatureDown(){
		if(power  && temperature > 18){
		temperature--;
		}else{
			temperature = 0;
		}
	}
	
	//풍량 버튼
	void airVolume(){
		if(power){
			if(3 < ++airVolume){ //조건 안에 증감식이 있어서 먼저 증감식을 하고 비교한다.
				airVolume = 1;
			}
		
		}else{
			airVolume = 0;
		}
	}
	
	//온도가 18 ~ 30 까지만 변경할 수 있게 해주시고,
	//전원을 켰을때만 버튼들이 작동되도록 메서드들을 변경해주세요.

}
