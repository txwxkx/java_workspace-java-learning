package java018_collection;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * 함수적 인터페이스 : 자주 사용하는 기능을 정의할 수 있는 함수 제공
 * 1. Consumer
 * 		- 입력은 있으나 출력은 없다.
 * 2. Supplier
 * 		- 입력은 없으나 출력은 있다.
 * 3. Predicate
 * 		- 입력은 있고, 츨력이 true 또는 false로만 리턴한다.
 * 
 */

public class Java204_removeIf {

	public static void main(String[] args) {
		Integer[] it = new Integer[] {3,5,2,4,7};
		ArrayList<Integer> aList = new ArrayList<Integer>(Arrays.asList(it));
		System.out.println(aList);
		
		//argument를 받아 true 값으로 반환되는 요소만 삭제
		//Predicate<Integer> p = x -> x%2==0;
		aList.removeIf(x -> x%2==0);
		System.out.println(aList.toString());
		
	}//end main()

}//end class
