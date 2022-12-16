package java019_inner.part04;

public class OuterAnonymous {
	private int x;
	
	InnerAnonymous ta = new InnerAnonymous() { //클래스에서 사용할 경우
		
		@Override
		public void prn() {
			System.out.println("prn");
			
		}
	};
	
	public void display() { 
		ta.prn();
		
		new InnerAnonymous() { //메소드에서만 사용할 경우
			
			@Override
			public void prn() {
				System.out.println("prn");
				
			}
		}.prn();
		
	}//end display()

}//end OuterAnonymous
