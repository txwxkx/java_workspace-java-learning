package java009_inheritance.part06;

public class BirdOver extends PetOver {
	
	public BirdOver() {
		
	}
	
	@Override //상속 받는 거에 맞게 더 구체적으로 표현하고 싶을 때
	public void move() {
		System.out.println("서브클래스(): 새가 날아갑니다.");
	}

}//end class
