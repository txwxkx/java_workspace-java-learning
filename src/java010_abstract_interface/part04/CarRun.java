package java010_abstract_interface.part04;

public interface CarRun {
	int carCount = 5; //public static final carCount = 5; //The blank final field carCount may not have been initialized 초기값 할당 안하면 오류
	//public CarRun() {}
	//static {System.out.println("CarRun");};
	void prn(); //public abstract 제어자 순서 바뀌어도 상관없음
	//void display() {}
	class Sun{ //public static
		public Sun() {
			System.out.println("Sun constructor");
		}
	}
	
}//end interface
