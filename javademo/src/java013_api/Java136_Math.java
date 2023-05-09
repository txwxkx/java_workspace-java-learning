package java013_api;

import static java.lang.Math.*;

/*
 * 난수를 이용해서 소수점 첫째자리까지 반올림해서 구하시오.
 *  ex) 0.5689....   =>5.7
 *      056.89 => 반올림 => 05.7
 */

public class Java136_Math {

	public static void main(String[] args) {
		double nan = random();
		System.out.println(nan);
	
		nan = nan * 100;
		System.out.println(nan);
		
		long data = round(nan);
		System.out.println(data);
		
		double num = (double)data/10;
		System.out.println(num);
		
		System.out.println("================================");
		
		System.out.println((double)round(random()*100)/10);
		
//		double num = (double)round(nan)/10;
//		System.out.println(num);
	
	}//end main()

}//end class
