package java018_collection;

import java.util.Iterator;
import java.util.TreeSet;

//TreeSet : 오름차순 정렬, 중복 안됨
public class Java192_LinkedList {

	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<Integer>();
		tree.add(10);
		tree.add(30);
		tree.add(5);
		tree.add(30);
		
		System.out.println(tree.size());
		
//		for(Integer it : tree)
//			System.out.println(it); //정렬 & 중복 제거 되어서 결과 도출
		
//		int cnt = tree.size();
//		for(int i = 0; i<cnt; i++) {
//			//System.out.println(tree.pollFirst());
//			System.out.println(tree.pollLast());
//		}
		
		Iterator<Integer> ita = tree.iterator();
		while(ita.hasNext())
			System.out.println(ita.next());
		
		System.out.println("========내림차순========");
		Iterator<Integer> ite = tree.descendingIterator();
		while(ite.hasNext())
			System.out.println(ite.next());
		
	}//end main()

}//end class
