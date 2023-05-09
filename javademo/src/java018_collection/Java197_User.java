package java018_collection;

public class Java197_User {

	public static void main(String[] args) {
		Box<Integer> intBox = new Box<Integer>();
		intBox.setData(10);
		System.out.println(intBox.getData());

		Box<String> strBox = new Box<String>("java");
		System.out.println(strBox.getData());
		
		Box<Double> douBox = new Box<Double>(4.5);
		System.out.println(douBox.getData());
		
	}//end main()

}//end class
