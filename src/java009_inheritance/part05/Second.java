package java009_inheritance.part05;


//import java.lang.System; 
//같은 package에 있는 경우 import X
//.System을 import 안해줬는데 이상 없는 이유 => 자바가상머신에 이미 탑재
//import java.lang.Override;

public class Second extends First {
	int b = 20;
	
	@Override
	void display() {
		System.out.println("b=" + b);
	}
	
	void superThisMethod() {
		super.display();
		this.display(); //this. 생략 가능		
	}
	
}//end class

