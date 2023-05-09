package java020_thread.part01;

public class User extends Thread {
	public User() {

	}
	
	@Override
	public void run() {
		//Thread으로 실행할 문장을 구현
		for(int i = 0; i<=5; i++) {
			System.out.printf("%s i=%d\n", getName(), i);
		}
		
		System.out.println("user: " + Thread.activeCount());
	}

}//end class
