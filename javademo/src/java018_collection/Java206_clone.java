package java018_collection;

import java.util.ArrayList;
import java.util.Arrays;

public class Java206_clone {

	public static void main(String[] args) {
		Integer[] it = new Integer[] {3,5,2,4,7};
		ArrayList<Integer> aList = new ArrayList<Integer>(Arrays.asList(it));
		System.out.println("sourceList: " + aList);
		
		//shallow copy : 주소복사가 되기 때문에
		ArrayList<Integer> copyList= aList;
		System.out.println("copyList: " + copyList);
		
//		copyList.set(0, 10);
//		System.out.println("sourceList: " + aList);
//		System.out.println("copyList: " + copyList);
		
		ArrayList<Integer> destList = new ArrayList<Integer>();
		for(int i = 0; i<aList.size(); i++) {
			destList.add(aList.get(i));
		}
		
		System.out.println("destList: " + destList);
		destList.set(0, 20);
		System.out.println("sourceList: " + aList);
		System.out.println("destList: " + destList);
		
		////////////////////clone()/////////////////////////
		
		ArrayList<Integer> cloneList = (ArrayList<Integer>)aList.clone();
		System.out.println("cloneList: " + cloneList);
		
		cloneList.set(0, 30);
		System.out.println("sourceList: " + aList);
		System.out.println("cloneList: " + cloneList);
				
			
	}///end main()
	
}//end class
