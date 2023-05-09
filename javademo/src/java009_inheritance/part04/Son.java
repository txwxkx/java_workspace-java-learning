package java009_inheritance.part04;

public class Son extends Parent {	
	String dept;
//	String name; 쓰면 안됨. 상속을 쓰는 의미 X
//	int age;
	
	public Son() {
		
	}
	
	public Son(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}
	
	public String toString() {
		return String.format("%s %d %s", name, age, dept);
	}

}
