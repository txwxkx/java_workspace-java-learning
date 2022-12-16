package java019_inner.part04;

public class Korea extends InnerAnonymous {
	@Override
	public void prn() {
		System.out.println("korea");		
	}

}

// Korea ka = new Korea();

// InnerAnonymous is = new Korea(); (O)

/* 이름없이 클래스를 정의하고 바로 new에서 객체 생성
   InnerAnonymous ia = new InnerAnonymous {
	@Override
	public void prn() {
		System.out.println("korea");		
	}

}
*/