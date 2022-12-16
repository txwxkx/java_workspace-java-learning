package java001_basic;

/*
 * 증감연산자 : 증가연산자(++), 감소연산자(--)
 * 전위연산자 : 증감연산자가 변수 앞에 있을 때
 * 후위연산자 : 증감연산자가 변수 뒤에 있을 때
 */
public class Java009_operators {

	public static void main(String[] args) {
		int x = 3;
		
		//전위 연산자
		++x;  // x = x + 1
		System.out.println(x);
		
		--x;
		System.out.println(x);

		//후위연산자		
		int y = 5;
		
		y++;
		System.out.println(y);
		
		y--;
		System.out.println(y);
		
		//리터널은 증감연산자를 사용할 수 없다.
		//10++;
		
		
		//상수 : 한번만 기억할 수 있는 메모리 공간
		final int NUM = 4;
		System.out.println(NUM);
		//상수는 증감연산자를 사용할 수 없다.
		//NUM++;		
	}//end main()

}//end class







