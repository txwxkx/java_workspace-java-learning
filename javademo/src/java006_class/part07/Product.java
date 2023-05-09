package java006_class.part07;
/*
 * this : 객체 자신을 의미한다.
 * 1. this.멤버변수
 * 2. this.메소드()
 * 3. this() : 생성자
 */
public class Product {
	String code;
	String pname;
	int cnt;
	
	
	public Product() {
		this("b001", "식품", 2000);
	}       //스트링   스트링   인트
	
	
	public Product(String code, String pname, int cnt) {
		this.code = code;
		this.pname = pname;
		this.cnt = cnt;		
	}
	
	void display() {
		System.out.printf("%s %s %d\n", code, pname, cnt);
	}
}//end class
