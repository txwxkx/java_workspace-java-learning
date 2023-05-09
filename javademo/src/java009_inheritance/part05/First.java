package java009_inheritance.part05;

/*
 * 오버라이딩(overriding)
 * 1. 부모클래스의 메소드를 자식클래스에서 재정의(메소드 구현부)하는 기능이다.
 * 2. 오버라이딩 조건
 * 	1) 부모클래스의 메소드와 자식클래스의 메소드 이름이 동일해야 한다.
 * 	2) 매개변수의 타입, 갯수, 순서가 일치해야 한다.
 * 	3) 리턴 타입이 동일해야 한다.
 * 	4) 접근제어자(제한자)는 부모클래스의 메소드와 같거나 더 넓은 범위어야 한다.
 * 		private < default < protected < public
 * 	5) 부모클래스 메소드에서 throws가 선언되어 있으면 자식클래스의 메소드에서는 같거나 더 구체적이면 된다.
 * 		Exception < RuntimeException < NullPointerException
 * 
 * 
 * 
 * super
 * 1. 자식클래스에서 부모클래스를 호출할때 사용한다.
 * 2. super.멤버변수
 * 	  super.메소드( )
 * 	  super( ) => 생성자
 * 
 * 
 * 단일클래스       vs       상속관계의 자식클래스
 * overloading    vs        overriding
 * this		      vs 	   super
 * - 스스로 정의해서 구술 면접 대비
 */
public class First {
	int a = 10;
	
	void display() {
		System.out.println("a=" + a);
	}

}//end class
