package java013_api;

import static java.lang.Math.*;

public class Java135_Math {

	public static void main(String[] args) {
		//임의값 0.0 <= x < 1.0
		double ran = random();
		System.out.println(ran);

		//0.00 <= x < 9.99
		ran = ran * 10;
		System.out.println(ran);
		
		System.out.println(floor(ran));
		
		//소수점 이하는 버림(0.0 ~ 9.0을 리턴)
		//정수 (0 ~ 9을 리턴)
		int num = (int)floor(ran);   //round(ran),  ceil(ran)
		System.out.println(num);
		
		//1부터 10까지
		num = num + 1;
		System.out.println(num);
		
		System.out.println("===============================================");
		
		System.out.println(((int)(floor(random()*10)))+1); //가장 안에 있는 가로부터 해석 ex)(a(b(c))), 점은 왼쪽부터 해석 ex)a.b.c
		
		double data = -25.5233;
		System.out.println(floor(data));
		System.out.println((int)data);
		
	}//end main()

}//end class
