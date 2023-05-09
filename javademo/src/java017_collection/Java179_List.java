package java017_collection;

public class Java179_List {

	public static void main(String[] args) {
		UserList uList = new UserList();
		uList.add(10);
		uList.add(20);
		uList.add(30);
		uList.add(40);
		
		Integer it1 = (Integer)uList.get(0);
		System.out.println(it1.intValue());
		
		try {
			uList.get(10);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.toString());
		}
		
		System.out.println("요소갯수:" + uList.size());
		
		System.out.println(uList.remove(0));
		System.out.println(uList.remove(1));
		System.out.println(uList.remove(2));
		System.out.println(uList.remove(3));
		System.out.println("요소갯수:" + uList.size());
		
		uList.add(50);
		System.out.println(uList.get(0));
		System.out.println("요소갯수:" + uList.size());
		
	}//end main()

}//end class
