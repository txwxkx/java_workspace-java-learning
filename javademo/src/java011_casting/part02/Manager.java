package java011_casting.part02;

public class Manager /* extends Object */{
	String name;
	String dept;
	String loc;
	
	public Manager() {
		
	}
	
	public Manager(String name, String dept, String loc) {
		this.name = name;
		this.dept = dept;
		this.loc = loc;
	}
	
	@Override
	public String toString() {
		return String.format("name:%s, dept:%s", name, dept);
	}
	
	public String display() {
		return String.format("%s님의 근무지역은 %s입니다.", name, loc);
	}
}//end class
