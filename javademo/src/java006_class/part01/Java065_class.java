package java006_class.part01;

public class Java065_class {

	public static void main(String[] args) {
		Person ps;  //객체참조변수 선언
		ps = new Person();  //객체 생성(메모리 확보)
		
		//Person ps = new Person();
		
		ps.name = "홍길동";
		ps.age = 30;
		ps.gender = '남';
		ps.develop();
		ps.run(100);
		
		System.out.printf("%s %d %c\n", ps.name, ps.age, ps.gender);
		
	}//end main()

}//end class
