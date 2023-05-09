package java018_collection;

import java.util.Comparator;

public class Descending implements Comparator<Integer> {
	@Override
	public int compare(Integer o1, Integer o2) {
		System.out.printf("%d %d => %d\n", o1, o2, o1.compareTo(o2));
		return o2.compareTo(o1);
	}
	
}//end class
