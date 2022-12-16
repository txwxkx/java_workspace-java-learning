package java018_collection;

import java.util.Vector;

public class Java200_Vector {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("java");
		v.add("jsp");
		v.add("spring");
		System.out.println(v.toString());
		
		v.remove(0);
		System.out.println(v.toString());
		
		v.removeAll(v);
		System.out.println(v.toString());


	}//end main()

}//end class
