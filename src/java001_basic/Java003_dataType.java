package java001_basic;
/*
 * 리터널(literal) : 그 자체의 값(1, 2, 3, ..., 'a','b','c'..., true, false)
 * 변수 (variable) : 하나의 값을 저장하기 위한 메모리 공간
 * 자바에서 제공하는 데이터 타입
 * 1. Primitive DataType (기본 데이터 타입)
 *    문자 - char(2byte)
 *    숫자 - 정수 - byte(1byte), short(2byte), int(4byte), long(8byte)
 *        - 실수 - float(4byte), double(8byte)
 *    논리 - boolean(1byte)
 *    
 * 2. Reference DataType (참조 데이터 타입)
 *    Array, Class , Interface
 * 
 *시스템에서 데이터 타입 크기
 * byte < char, short < int < long < float < double
 */


public class Java003_dataType {
	public static void main(String[] args) {
		//ⓐ 변수 선언
		int data;  //데이터타입  변수명;
		
		
		//ⓑ 값을 할당
		data = 3; //data변수에 3값을 할당(저장)
		
		System.out.println(data);  //3
		
		//data변수에 새로운 값 할당
		data = 10;				
		System.out.println(data);
		
		double avg = 4;
		System.out.println(avg);
		
		//Type mismatch: cannot convert from double to int
		//int num = 4.0;
		
		//Type mismatch: cannot convert from float to long
		//long ko = 4.0F;
		
		int x = 0101; //8진수
		System.out.println(x);
		
		int y = 65; //10진수
		System.out.println(y);
		
		int z = 0B101; //2진수(0B101 == 0b101)
		System.out.println(z); //5
		
		int k = 0X101; //16진수  (0X101 == 0x101)
		System.out.println(k);				
	}

}

















