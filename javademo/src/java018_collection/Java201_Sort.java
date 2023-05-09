package java018_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class Java201_Sort {

	public static void main(String[] args) {
		Integer[] arr = new Integer[] {1,3,5,2,4,1};
//		Arrays.sort(arr);
//		for(Integer it : arr)
//			System.out.println(it);
		
		List<Integer> ager = Arrays.asList(arr);
		ArrayList<Integer> aList = new ArrayList<Integer>(ager);
		//void java.util.ArrayList.sort(Comparator<? super Integer> c)
		aList.sort(new Ascending());  //Comparator 인터페이스
		System.out.println(aList.toString());
		
		aList.sort(new Descending());
		System.out.println(aList.toString());
		
		
	}//end main()

}//end class
