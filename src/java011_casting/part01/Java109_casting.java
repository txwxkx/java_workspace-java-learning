package java011_casting.part01;
 /*
  * 자바에서 제공하는 데이터 타입(data type)
  * 1. primitive data type : byte, short, int, long, float, double, booleanm char
  * 2. reference data type : arr, class, interface, enum
  * 
  * [argument 전달방식]
  * 1. call by value : 값에 의한 복사
  * 	  argument을 전달할 때 primitive data type을 넘겨주는 형식
  * 	  장점 : 복사하여 처리하기 때문에 원래 값이 보존이 되어 안전하다.
  *    단점 : 복사를 하기 때문에 메모리 사용량이 늘어난다.
  * 2. call by reference : 주소에 의한 복사
  * 	  void process(int[] arr){}
  * 	  process(new int[]{1,2,3});
  * 	  argument을 전달할 때 reference data type을 넘겨주는 형식
  * 	  장점 : 참조를 하기 때문에 메모리를 절약한다.
  * 	  단점 : 참조를 하기 때문에 원래 값에 영향을 받는다.
  * 
  * 형변환(casting) - 기본 데이터 타입
  * 1. 묵시적 형변환(자동 형변환) : 작 => 큰
  * 2. 명시적 형변환(강제 형변환) : 큰 => 작
  * 	int num = 3;
  * 	double data = num; //묵시적 형변환
  * 	short val = (short)num; //명시적 형변환
  * 
  * 객체형 변환 - 참조데이터 타입
  * 1. 상속관계일때 형변환이 가능하다.(is a)
  * 2. 업스캐팅 발생된 후 다운캐스팅을 할 수 있다.
  * 	- 업캐스팅 : 부모객체로 자식객체를 참조할 수 있도록 형변환하는 기술
  * 	- 다운캐스팅 : 업캐스팅을 다시 원상복귀해주는 형변환하는 기술
  * 
  * class 관계
  * 1. is a : 상속관계
  * 2. has a : 포함관계
  */
public class Java109_casting {
	
	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.process();
		
		Child c = new Child();
		c.process();
		
		//업캐스팅(up-casting)
		Parent pn = c; 
		
		//다운캐스팅(down-casting)
		Child cd = (Child)pn;		
		cd.call();
		
		//객체 생성 및 업캐스팅
		Parent pt = new Child(); //업캐스팅
		pt.process();
		
		//다운캐스팅
		Child ct = (Child)pt;
		ct.call();
		
	}//end main()

}//end class
