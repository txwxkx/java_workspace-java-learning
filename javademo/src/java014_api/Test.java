package java014_api;

abstract public class Test {

	abstract public void display();
	
	public static Test getInstance() {
		return new TestExam();
	}
	
}


// Test tt = TestExam();