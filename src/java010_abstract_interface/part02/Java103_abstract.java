package java010_abstract_interface.part02;

public class Java103_abstract {

	public static void main(String[] args) {
		Tri tri = new Tri(10, 20);
		System.out.println("삼각형 넓이 : " + tri.getArea());
		
		Rect rect = new Rect(10, 20);
		System.out.println("사각형 넓이 : " + rect.getArea());

	}//end main()

}//end class
