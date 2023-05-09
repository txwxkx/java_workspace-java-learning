package java017_collection;

import java.util.ArrayList;

public class Java185_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<String>();
		aList.add(new String("Java"));
		aList.add(new String("jsp"));
		aList.add(new String("spring"));
		prnDisplay(aList);
		process(aList);

	}//end main()
	
	public static void prnDisplay(ArrayList<String> aList) {
		// aList매개변수의 요소에서 'J' or 'j'가 포함되어 있는 
		// 요소만 출력하는 프로그램을 구현하시오.
		
		for(String sn : aList) { //대소문자 구분 X
			if(sn.toLowerCase().contains("j"))
				System.out.println(sn);
		}	
		
	}//end prnDisplay()
	
	public static void process(ArrayList<String> aList) {
		System.out.println(aList.contains("jsp"));
	}//end process()

}//end class
