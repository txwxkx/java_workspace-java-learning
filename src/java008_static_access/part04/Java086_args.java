package java008_static_access.part04;

//Javac -d(디렉토리 생성) . Java086_args.java
//java java008_static_access.part04.Java086_args hello world 2022
public class Java086_args {
//public - 접근제어자(modifier)라고 부름

	public static void main(String[] args) {
//		System.out.println(args[0]);
//		System.out.println(args[1]);
//		System.out.println(args[2]);
		
//		for(int i = 0; i < args.length; i++) {
//			System.out.println(args[i]);
//		}
		
		for(String data : args) {
			System.out.println(data);
		}

	}//end main()

}//end class
