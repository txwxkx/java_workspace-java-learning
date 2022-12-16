package java018_collection;

import java.util.Enumeration;
import java.util.Hashtable;

/*
 * Hashtable
 * 1. Map인터페이스 구현해 놓은 클래스이다.
 * 2. Map인터페이스를 구현해 놓은 클래스들은 key, value 쌍으로 저장한다.
 * 3. value을 구현해 주는 것은 key 이므로 중복을 허용하지 않는다.
 */

public class Java194_Hashtable {

	public static void main(String[] args) {
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		table.put(10, "java");
		table.put(20, "jsp");
		table.put(30, "spring");
		table.put(20, "mysql");
		System.out.println("size:" + table.size());
		System.out.println(table.get(20));
		
		System.out.println("==========Enumeration==========");
		//key 가져오기
		Enumeration<Integer> enuKey = table.keys();
		while(enuKey.hasMoreElements()) {
			//System.out.println(enuKey.nextElement());
			Integer it = enuKey.nextElement();
			System.out.printf("%d %s\n", it.intValue(), table.get(it));
		}
		
		//value 가져오기
		Enumeration<String> enuValue = table.elements();
		while(enuValue.hasMoreElements())
			System.out.println(enuValue.nextElement());

	}//end main()

}//end class
