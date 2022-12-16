package java008_static_access.part07;

public class Java090_singleton {

	public static void main(String[] args) {
		//MemberDAO mm = new MemberDAO();
		
		MemberDAO mb = MemberDAO.getInstance();
		mb.display();
		
		MemberDAO mc = MemberDAO.getInstance();
		mc.display();
		
		System.out.println(mb==mc); //같은 걸 바라볼때 false, 다른 걸 바라볼때 true

	}//end main()

}//end class
