package java010_abstract_interface.part01;
/*
 * 1. 자식 추상 클래스
 * 	1) abstract
 * 	2) 
 * 2. 추상메소드 오버라이딩
 * 	1) 객체 생성할 수 있음
 */
public class TruckAbs extends CarAbs {
	
	public TruckAbs() {
		
	}
	
	@Override
	public void work() {
		System.out.println("트럭에 짐을 싣고 있다.");
		
	}

}//end class
