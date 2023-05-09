package java018_collection;

public class Java202_Sort {

	public static void main(String[] args) {

		String a = "ABCawser24";
		String b = "ABC";
		String d = "ABC";
		String e = "ab";

		System.out.println(a.compareTo(b)); //7
		System.out.println(b.compareTo(a)); //-7

		System.out.println(b.compareTo(d)); //0
		
		System.out.println(b.compareTo(e)); //-32
		System.out.println(e.compareTo(b)); //32


	}//end main()

}//end class
