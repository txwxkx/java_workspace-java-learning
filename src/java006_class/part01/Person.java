package java006_class.part01;

public class Person { //같은 패키지라면 바로 참조 가능, 다른 패키지이면 import
	String name;  //멤버변수
	int age;
	char gender;
	
	//메소드
	void develop() {
		System.out.println("개발한다.");
	}
	
	void run(int miter) {
		System.out.println(miter + "달린다.");
	}
}
