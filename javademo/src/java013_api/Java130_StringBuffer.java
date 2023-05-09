package java013_api;

public class Java130_StringBuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java test");
		
		sb.insert(4, ",jsp");
		System.out.println(sb); //java,jsp test
		
		sb.delete(4, 8);
		System.out.println(sb); //java test
		
		sb.append(" start");
		System.out.println(sb); //java test start
		
		//문자열을 반대로 변경
		sb.reverse();
		System.out.println(sb); //trats tset avaj
		
		//String => StringBuffer => String
		String data = "mybatis orm";
		StringBuffer sf = new StringBuffer(data);
		sf.reverse();
		System.out.println(sf);
		System.out.println(data);
		String re = sf.toString();
		System.out.println(re);
		
		//char[] => String => StringBuffer
		char[] arr = {'k','o','r','e','a'};
		StringBuffer se = new StringBuffer(new String(arr));
		se.reverse();
		System.out.println(se);
		
		//char[] => String => StringBuffer
		System.out.println(new StringBuffer(String.valueOf(arr)).reverse());
		
		//char[] => StringBuffer
		StringBuffer st = new StringBuffer();
		st.append(arr);
		st.reverse();
		System.out.println(st);
		
		//StringBuffer => String => char[]
		String ss = st.toString();
		char[] val = ss.toCharArray();
		System.out.println(val);
		
		System.out.println(st.toString().toCharArray());
		
		
		}// end main()

}//end class
