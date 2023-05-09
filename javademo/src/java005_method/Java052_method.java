package java005_method;
/*
 * method(메소드) 정의
 * 1. 값을 게산하기 위해서 사용되는 기능이다.
 * 2. 객체의 동작을 처리하기 위한 기능이다.
 * 
 * method 정의 : 선언부 + 구현부
 * 반환자료형 메소드명(데이터타타입 매개변수)     => 메소드 선언부
 * {
 * 		메소드가 호출되었을 때 실행할 구문;     => 메소드 구현부
 * 		return 값;
 * }
 * 
 * 1. 리턴값이 없고 매개변수도 없느 형태
 * 	void add( ){
 * 		int x = 10;
 *  	int y = 20;
 *  
 *   	System.out.println(x+y);
 *  }
 *  
 *  add();
 *  
 * 2. 리턴값이 있고 매개변수는 없는 형태
 *    double avg(){
 *    	int x = 10;
 *    	int y = 20;
 *    
 *    	return (x+y)/2.0;
 *    }
 *    
 * 3. 리턴값이 없고 매개변수는 있는 형태
 * 				 (parameter-매개변수)
 *    void plus(int x, int y){
 *    	System.out.println(x+y);
 *    }
 *    
 *        (argument-인수)
 *    plus(10,20);
 *    
 * 4. 리턴값이 있고 매개변수도 있는 형태
 * 	  double avg(int x, int y){
 * 		return (x+y)/2.0;
 * 	  }
 * 
 * 	  
 */
public class Java052_method {

	//프로그램을 실행하면
	//JVM(자바가상머신-Java Virtual Machine)에서
	//main스레드가 main()메소드를 호출한다.
	public static void main(String[] args) { //1
		System.out.println("main start"); //2
		makeTest(); //3
		System.out.println("main end"); //7
		
		

	}//end main() //8
	
	public static void makeTest() { //4
		System.out.println("makeTest run"); //5
	} //6

}//end class
