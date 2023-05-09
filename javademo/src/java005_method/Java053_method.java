package java005_method;
/*
 * [출력결과]
 * 홍길동님은 회원입니다.
 * 3000포인트가 적립되었습니다.
 */

public class Java053_method {

	public static void main(String[] args) { //1
		process("홍길동", true); //2
		save(3000); //7
		

	}//end main() //11
	
	//회원여부 : process()
	public static void process(String name, boolean chk) { //3
		if(chk) { //4
			System.out.printf("%s님은 회원입니다.\n", name); //5
		} else {
			System.out.printf("%s님은 비회원입니다.\n", name);
		}//end process //6
		
	}//포인트 적립 : save()
	public static void save(int point) { //8
		System.out.printf("%d포인트가 적립되었습니다.", point); //9
	}//end save //10

}//end class
