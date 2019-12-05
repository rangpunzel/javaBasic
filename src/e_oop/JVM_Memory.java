package e_oop;

public class JVM_Memory {
	/*
	 * << JVM(Java Virtual Machine) >>
	 * - 자바로 만들어진 프로그램이 실행되는 컴퓨터 안의 가상 컴퓨터
	 * - 운영체제 -> JVM -> 자바프로그램
	 * - 장점 : 운영체제에 상관없이 실행할 수 있다.
	 * - 단점 : 속도가 느리다.
	 * 
	 * << JVM 메모리 구조 >>
	 * - Method Area : 클래스가 저장된다.
	 * - Call Stack : 현재 호출되어 있는 메서드가 저장된다.
	 * - Heap : 객체가 저장된다.
	 * 
	 * 
	 * << Call Stack >>
	 * |____________|
	 * |____________|	선입후출...?
	 * |__method2___|    main() method1 method2
	 * |__method1___|    
	 * |__main()____|
	 */
}
