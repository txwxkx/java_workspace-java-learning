package java010_abstract_interface.part07;

public class FinalTest {
	final int CODE = 1; //반드시 초기값을 할당해줘야함, final이 선언된 변수는 대문자를 사용할 것을 권장함.
	
	public FinalTest() {
		
	}
	
	void display() {
		System.out.println("display");
	}
	
	//상속은 되지만 오버라이딩은 되지 않음
	final void process() {
		System.out.println("process");
	}
		
}//end class
