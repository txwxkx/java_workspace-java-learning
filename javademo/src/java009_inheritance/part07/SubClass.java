package java009_inheritance.part07;

public class SubClass extends SuperClass {
	
	public SubClass() {
		
	}
	


	public SubClass(int a, int b, int c) { //2
		super(a, b, c); //3
		display(); //22
		sumData(); //26
		
		
	} //30

	public void sumData() { //27
		System.out.println("합: " + (x + y + z)); //28
	} //29

}
