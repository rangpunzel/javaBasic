package f_oop2;

public class Time {
	
	private int hour;
	private int minute;
	private int second;
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		if(hour < 0){
			this.hour = 0;
		}else{
			this.hour = hour%24;
		}
		
//		if(hour >= 0 && hour < 24){
//		this.hour = hour;}
//		else if(hour >= 24){
//			this.hour = hour%24;
//		}else if(hour < 0){
//			this.hour = 0;
//		}
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if(minute < 0){
			this.minute = 0;
		}else{
			setHour(this.hour + minute /60);
			this.minute = minute%60;
		}
//		if(minute >= 0 && minute < 60){
//		this.minute = minute;}
//		else if(minute >= 60){
//			hour+= minute/60;
//			this.minute = minute%60;
//			if(hour > 24){
//				setHour(hour);
//			}
//		}else if(minute < 0){
//			this.minute = 0;
//		}
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if(second < 0){
			this.second = 0;
		}else{
			setMinute(this.minute + second /60);
			this.second = second%60;
		}
		
//		if(second >= 0 && second < 60){
//		this.second = second;}
//		else if(second >= 60){
//			minute+= second/60;
//			this.second = second%60;
//			if(minute > 60){
//				setMinute(minute);
//			}
//		}else if(second < 0){
//			this.second = 0;
//		}
	}
	
	//Object클래스로부터 상속받은 메서드
	@Override
	public String toString(){
		return hour + ":" + minute + ":" + second;
	}
}
