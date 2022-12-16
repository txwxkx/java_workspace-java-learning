package java020_thread.part03;

public class LifeCycle extends Thread {
	public LifeCycle() {

	}
	
	@Override
	public void run() { 
 		System.out.println(getState()); //getState() : 현재 객체값의 스레드 상태
	}

}//end class
