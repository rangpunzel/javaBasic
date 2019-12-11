package f_oop2.test;

import f_oop2.AccessModifier;

public class AccessTest extends AccessModifier {

	public static void main(String[] args) {
		AccessModifier am = new AccessModifier();
		
		System.out.println(am.publicVar);
		am.publicMethod();
		
//		System.out.println(am.protectedVar);
//		am.protectedMethod();
//		
//		System.out.println(am.defaultVar);
//		am.defaultMethod();
//		
//		System.out.println(am.privateVar);
//		am.privateMethod();
		
		AccessTest at = new AccessTest();    //인스턴스 변수와 메서드라서 객체생성을 해주어야한다.
		System.out.println(at.protectedVar);
		at.protectedMethod();
		
		
	}

}
