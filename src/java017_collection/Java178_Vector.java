package java017_collection;

import java.util.Vector;

public class Java178_Vector {

	public static void main(String[] args) {
		Vector v = new Vector();
		
		//Integer => Object : up-casting
		v.add(new Integer(10)); //deprecated(더 이상 사용되지 않음)
		v.add(new Integer(20)); 
		
		//int => Integer => Object : auto boxing => up-casting
		v.add(30);
		v.add(40);
		
		//String => Object : up-casting
		v.add(new String("java"));
		
		//Type mismatch: cannot convert from Object to Integer
		//Integer it1 = v.get(0); //Object로 가져옴
		
		//Object => Integer : down-casting
		Integer it1 = (Integer)v.get(0); 
		Integer it2 = (Integer)v.get(1);
		Integer it3 = (Integer)v.get(2);
		Integer it4 = (Integer)v.get(3);
		String sn = (String)v.get(4);
		System.out.println(it1.intValue());
		System.out.println(it2.intValue());
		System.out.println(it3.intValue());
		System.out.println(it4.intValue());
		System.out.println(sn);
		
		try {
		System.out.println(v.get(20)); //java.lang.ArrayIndexOutOfBoundsException (배열 방식)
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.toString());
		}
		
	}//end main()

}//end class
