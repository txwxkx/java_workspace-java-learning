package java009_inheritance.part02;

public class MyChild extends MyFather {
	
	public MyChild() { //2
		//자손생성자에서는 반드시 부모생성자를 호출해야한다.
		super(); //3
		System.out.println("MyChild"); //12
	} //13

}
