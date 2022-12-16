package java018_collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Java189_LinkedList {

	public static void main(String[] args) {
		System.out.println("========ArrayList========");
		ArrayList<String> aList = new ArrayList<String>();
		
		aList.add(new String("java"));
		aList.add(new String("jsp"));
		aList.add(new String("spring"));
		
		ListIterator<String> ank = aList.listIterator();
		
		System.out.println("앞=>뒤");
		while(ank.hasNext()) //포인터가 끝까지 이동
			System.out.println(ank.next());
		
		System.out.println("뒤=>앞");
		while(ank.hasPrevious())
			System.out.println(ank.previous());
		
		System.out.println("========LinkedList=========");
		LinkedList<String> aNode = new LinkedList<String>();
		//append
		aNode.add(new String("java"));
		aNode.add(new String("jsp"));
		aNode.add(new String("spring"));
		
		ListIterator<String> ite = aNode.listIterator();
		
		System.out.println("앞=>뒤");
		while(ite.hasNext()) //포인터가 끝까지 이동
			System.out.println(ite.next());
		
		System.out.println("뒤=>앞");
		while(ite.hasPrevious())
			System.out.println(ite.previous());
		
	}//end main()

}//end class
