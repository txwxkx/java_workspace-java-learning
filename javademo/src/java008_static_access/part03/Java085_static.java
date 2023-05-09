package java008_static_access.part03;

public class Java085_static {
	int x = 3;
	static int y = 5;
	
	public static void main(String[] args) {
		//System.out.printf("x=d\n", x);
		System.out.printf("x=%d\n", y);
		
		Java085_static js = new Java085_static();
		js.process(); //process 허용 X, 사용하기 위해서는 new객체 생성 후 호출
		
		display(); //같은 시점
		
	}//end main()
	
	public void process() {
		System.out.printf("x=d\n", x);
		System.out.printf("x=%d\n", y);
		System.out.println("process");
	}
	
	public static void display() {
		System.out.println("display");
	}

}//end class
