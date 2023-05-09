package java006_class.part08;
/*
 * 사원중에 부서가 결정되지 않은 경우 부서는 "보류", 급여는 3000으로
 * 기본값으로 설정한다.
 */
public class Employees {
	String name;
	String dept;
	int salary;
	
	public Employees() {
		
	}
	
	public Employees(String name) {
		//생성자 호출은 다른 문장보다 먼저 수행해야 한다.
		this("보류", 3000); // 생성자 먼저, 순서 중요
		this.name = name;
	}
	
	public Employees(String dept, int salary) {
		this.dept = dept;
		this.salary = salary;
	}
	
	public Employees(String name, String dept, int salary) {
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	
	public String toString() {
		return String.format("%s %s %d\n", name, dept, salary);
	}
}//end class
