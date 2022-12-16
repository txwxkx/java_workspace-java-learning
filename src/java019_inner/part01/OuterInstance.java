package java019_inner.part01;

public class OuterInstance {
	private int num;
	private int data;
	InnerInstance ist;
	//Outer에 있는 자원을 Inner 클래스에서 쓰기 위함이지 그 반대는 주가 될 수 없다.
	
	public void display() {
		System.out.println("display");
		ist = new InnerInstance();
		System.out.println(ist.local);
	}
	
	class InnerInstance {
		int local = 4;
		public void run() {
			num = 10;
			System.out.println(num);
		}
		
	}//end dispaly()

}//end class
